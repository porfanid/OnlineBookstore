package com.porfanid.backend.service.requests;

import com.porfanid.backend.book.BookService;
import com.porfanid.backend.user.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookPage {
    @Autowired
    private RequestsRepo requestsRepo;

    @GetMapping("/books")
    public String getAllBooks(HttpSession session, Model model) {
        User temp = (User)session.getAttribute("user");
        if (temp==null){
            return "redirect:/login";
        }
        List<Requests> allRequests = requestsRepo.findAll();
        ArrayList<Requests> userRequests = new ArrayList<>();
        for (Requests request : allRequests) {
            if(request.getHolder().equals(temp.getUsername())){
                userRequests.add(request);
            }
        }

        model.addAttribute("userRequests", userRequests);
        return "books"; // This corresponds to the name of your HTML template (books.html)
    }
}
