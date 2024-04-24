package com.porfanid.backend.service.requests;

import com.porfanid.backend.book.BookService;
import com.porfanid.backend.user.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookPage {
    @Autowired
    private RequestsRepo requestsRepo;

    @GetMapping("/borrowBook")
    public String borrowBook(@RequestParam String title, @RequestParam String owner, HttpSession session, Model model) {
        User temp = (User)session.getAttribute("user");
        if (temp==null){
            return "redirect:/login";
        }
        Requests temprequest = new Requests(temp.getUsername(), title, owner, 0);

        requestsRepo.save(temprequest);

        model.addAttribute("request", temprequest);
        return "successRequest"; // This corresponds to the name of your HTML template (books.html)
    }

    @GetMapping("/confirmRequest")
    public String acceptRequest(@RequestParam String username,@RequestParam String title,@RequestParam String holder, Model model){
        Requests request = new Requests(username, title, holder, 0);
        requestsRepo.updateAcceptedStatus(request);
        model.addAttribute("request", request);
        return "successAcceptRequest";
    }

    @GetMapping("/rejectRequest")
    public String rejectRequest(@RequestParam String username,@RequestParam String title,@RequestParam String holder, Model model){
        Requests request = new Requests(username, title, holder, 0);
        requestsRepo.updateDeniedStatus(request);
        model.addAttribute("request", request);
        return "successRejectRequest";
    }
}
