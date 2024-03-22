import logo from './logo.svg';
import Header from "./header";

function App() {
  return (
      <>
        <Header/>
        <section id="billboard">

            <div className="container">
                <div className="row">
                    <div className="col-md-12">

                        <button className="prev slick-arrow">
                            <i className="icon icon-arrow-left"></i>
                        </button>

                        <div className="main-slider">
                            <div className="slider-item">
                                <div className="banner-content">
                                    <h2 className="banner-title">Life of the Wild</h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu feugiat amet, libero
                                        ipsum enim pharetra hac. Urna commodo, lacus ut magna velit eleifend. Amet, quis
                                        urna, a eu.</p>
                                    <div className="btn-wrap">
                                        <a href="#" className="btn btn-outline-accent btn-accent-arrow">Read More<i
                                            className="icon icon-ns-arrow-right"></i></a>
                                    </div>
                                </div>
                                <img src="/images/main-banner1.jpg" alt="banner" className="banner-image"/>
                            </div>

                            <div className="slider-item" >
                                <div className="banner-content">
                                    <h2 className="banner-title">Birds gonna be Happy</h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu feugiat amet, libero
                                        ipsum enim pharetra hac. Urna commodo, lacus ut magna velit eleifend. Amet, quis
                                        urna, a eu.</p>
                                    <div className="btn-wrap">
                                        <a href="#" className="btn btn-outline-accent btn-accent-arrow">Read More<i
                                            className="icon icon-ns-arrow-right"></i></a>
                                    </div>
                                </div>
                                <img src="/images/main-banner2.jpg" alt="banner" className="banner-image"/>
                            </div>

                        </div>

                        <button className="next slick-arrow">
                            <i className="icon icon-arrow-right"></i>
                        </button>

                    </div>
                </div>
            </div>

        </section>


        <section id="client-holder" data-aos="fade-up">
            <div className="container">
                <div className="row">
                    <div className="inner-content">
                        <div className="logo-wrap">
                            <div className="grid">
                                <a href="#"><img src="/images/client-image1.png" alt="client"/></a>
                                <a href="#"><img src="/images/client-image2.png" alt="client"/></a>
                                <a href="#"><img src="/images/client-image3.png" alt="client"/></a>
                                <a href="#"><img src="/images/client-image4.png" alt="client"/></a>
                                <a href="#"><img src="/images/client-image5.png" alt="client"/></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>


        <section id="best-selling" className="leaf-pattern-overlay">
            <div className="corner-pattern-overlay"></div>
            <div className="container">
                <div className="row justify-content-center">

                    <div className="col-md-8">

                        <div className="row">

                            <div className="col-md-6">
                                <figure className="products-thumb">
                                    <img src="/images/single-image.jpg" alt="book" className="single-image"/>
                                </figure>
                            </div>

                            <div className="col-md-6">
                                <div className="product-entry">
                                    <h2 className="section-title divider">Best Selling Book</h2>

                                    <div className="products-content">
                                        <div className="author-name">By Timbur Hood</div>
                                        <h3 className="item-title">Birds gonna be happy</h3>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eu feugiat amet,
                                            libero ipsum enim pharetra hac.</p>
                                        <div className="item-price">$ 45.00</div>
                                        <div className="btn-wrap">
                                            <a href="#" className="btn-accent-arrow">shop it now <i
                                                className="icon icon-ns-arrow-right"></i></a>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>

                    </div>

                </div>
            </div>
        </section>

        <section id="popular-books" className="bookshelf py-5 my-5">
            <div className="container">
                <div className="row">
                    <div className="col-md-12">

                        <div className="section-header align-center">
                            <div className="title">
                                <span>Some quality items</span>
                            </div>
                            <h2 className="section-title">Popular Books</h2>
                        </div>

                        <ul className="tabs">
                            <li data-tab-target="#all-genre" className="active tab">All Genre</li>
                            <li data-tab-target="#business" className="tab">Business</li>
                            <li data-tab-target="#technology" className="tab">Technology</li>
                            <li data-tab-target="#romantic" className="tab">Romantic</li>
                            <li data-tab-target="#adventure" className="tab">Adventure</li>
                            <li data-tab-target="#fictional" className="tab">Fictional</li>
                        </ul>

                        <div className="tab-content">
                            <div id="all-genre" data-tab-content="" className="active">
                                <div className="row">

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item1.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Portrait photography</h3>
                                                <span>Adam Silber</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item2.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Once upon a time</h3>
                                                <span>Klien Marry</span>
                                                <div className="item-price">$ 35.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item3.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Tips of simple lifestyle</h3>
                                                <span>Bratt Smith</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item4.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Just felt from outside</h3>
                                                <span>Nicole Wilson</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                </div>
                                <div className="row">

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item5.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Peaceful Enlightment</h3>
                                                <span>Marmik Lama</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item6.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Great travel at desert</h3>
                                                <span>Sanchit Howdy</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item7.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Life among the pirates</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item8.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Simple way of piece life</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                </div>

                            </div>
                            <div id="business" data-tab-content>
                                <div className="row">
                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item2.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Peaceful Enlightment</h3>
                                                <span>Marmik Lama</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item4.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Great travel at desert</h3>
                                                <span>Sanchit Howdy</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item6.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Life among the pirates</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item8.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Simple way of piece life</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                </div>
                            </div>

                            <div id="technology" data-tab-content>
                                <div className="row">
                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item1.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Peaceful Enlightment</h3>
                                                <span>Marmik Lama</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item3.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Great travel at desert</h3>
                                                <span>Sanchit Howdy</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item5.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Life among the pirates</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item7.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Simple way of piece life</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div id="romantic" data-tab-content>
                                <div className="row">
                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item1.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Peaceful Enlightment</h3>
                                                <span>Marmik Lama</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item3.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Great travel at desert</h3>
                                                <span>Sanchit Howdy</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item5.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Life among the pirates</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item7.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Simple way of piece life</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div id="adventure" data-tab-content>
                                <div className="row">
                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item5.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Life among the pirates</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item7.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Simple way of piece life</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div id="fictional" data-tab-content>
                                <div className="row">
                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item5.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Life among the pirates</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>

                                    <div className="col-md-3">
                                        <div className="product-item">
                                            <figure className="product-style">
                                                <img src="/images/tab-item7.jpg" alt="Books" className="product-item"/>
                                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                        Cart</button>
                                            </figure>
                                            <figcaption>
                                                <h3>Simple way of piece life</h3>
                                                <span>Armor Ramsey</span>
                                                <div className="item-price">$ 40.00</div>
                                            </figcaption>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>

                    </div>

                </div>
            </div>
        </section>

        <section id="quotation" className="align-center pb-5 mb-5">
            <div className="inner-content">
                <h2 className="section-title divider">Quote of the day</h2>
                <blockquote data-aos="fade-up">
                    <q>“The more that you read, the more things you will know. The more that you learn, the more places
                        you’ll go.”</q>
                    <div className="author-name">Dr. Seuss</div>
                </blockquote>
            </div>
        </section>

        <section id="special-offer" className="bookshelf pb-5 mb-5">

            <div className="section-header align-center">
                <div className="title">
                    <span>Grab your opportunity</span>
                </div>
                <h2 className="section-title">Books with offer</h2>
            </div>

            <div className="container">
                <div className="row">
                    <div className="inner-content">
                        <div className="product-list" data-aos="fade-up">
                            <div className="grid product-grid">
                                <div className="product-item">
                                    <figure className="product-style">
                                        <img src="/images/product-item5.jpg" alt="Books" className="product-item"/>
                                            <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                                Cart</button>
                                    </figure>
                                    <figcaption>
                                        <h3>Simple way of piece life</h3>
                                        <span>Armor Ramsey</span>
                                        <div className="item-price">
                                            <span className="prev-price">$ 50.00</span>$ 40.00
                                        </div>

                            </figcaption>
                                </div>
                            <div className="product-item">
                                <figure className="product-style">
                                    <img src="/images/product-item6.jpg" alt="Books" className="product-item"/>
                                        <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                            Cart</button>
                                </figure>
                                <figcaption>
                                    <h3>Great travel at desert</h3>
                                    <span>Sanchit Howdy</span>
                                    <div className="item-price">
                                        <span className="prev-price">$ 30.00</span>$ 38.00
                                    </div>
                        </figcaption>
                            </div>
                        <div className="product-item">
                            <figure className="product-style">
                                <img src="/images/product-item7.jpg" alt="Books" className="product-item"/>
                                    <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                        Cart</button>
                            </figure>
                            <figcaption>
                                <h3>The lady beauty Scarlett</h3>
                                <span>Arthur Doyle</span>
                                <div className="item-price">
                                    <span className="prev-price">$ 35.00</span>$ 45.00
                                </div>

                    </figcaption>
                        </div>s
                    <div className="product-item">
                        <figure className="product-style">
                            <img src="/images/product-item8.jpg" alt="Books" className="product-item"/>
                                <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                    Cart</button>
                        </figure>
                        <figcaption>
                            <h3>Once upon a time</h3>
                            <span>Klien Marry</span>
                            <div className="item-price">
                                <span className="prev-price">$ 25.00</span>$ 35.00
                            </div>

                </figcaption>
                    </div>
                <div className="product-item">
                    <figure className="product-style">
                        <img src="/images/product-item2.jpg" alt="Books" className="product-item"/>
                            <button type="button" className="add-to-cart" data-product-tile="add-to-cart">Add to
                                Cart</button>
                    </figure>
                    <figcaption>
                        <h3>Simple way of piece life</h3>
                        <span>Armor Ramsey</span>
                        <div className="item-price">$ 40.00</div>
                    </figcaption>
                </div>
            </div>
        </div>
      </div>
</div>
</div>
</section>

    <section id="subscribe">
        <div className="container">
            <div className="row justify-content-center">

                <div className="col-md-8">
                    <div className="row">

                        <div className="col-md-6">

                            <div className="title-element">
                                <h2 className="section-title divider">Subscribe to our newsletter</h2>
                            </div>

                        </div>
                        <div className="col-md-6">

                            <div className="subscribe-content" data-aos="fade-up">
                                <p>Sed eu feugiat amet, libero ipsum enim pharetra hac dolor sit amet, consectetur. Elit
                                    adipiscing enim pharetra hac.</p>
                                <form id="form">
                                    <input type="text" name="email" placeholder="Enter your email addresss here"/>
                                        <button className="btn-subscribe">
                                            <span>send</span>
                                            <i className="icon icon-send"></i>
                                        </button>
                                </form>
                            </div>

                        </div>

                    </div>
                </div>

            </div>
        </div>
    </section>

    <section id="latest-blog" className="py-5 my-5">
        <div className="container">
            <div className="row">
                <div className="col-md-12">

                    <div className="section-header align-center">
                        <div className="title">
                            <span>Read our articles</span>
                        </div>
                        <h2 className="section-title">Latest Articles</h2>
                    </div>

                    <div className="row">

                        <div className="col-md-4">

                            <article className="column" data-aos="fade-up">

                                <figure>
                                    <a href="#" className="image-hvr-effect">
                                        <img src="/images/post-img1.jpg" alt="post" className="post-image"/>
                                    </a>
                                </figure>

                                <div className="post-item">
                                    <div className="meta-date">Mar 30, 2021</div>
                                    <h3><a href="#">Reading books always makes the moments happy</a></h3>

                                    <div className="links-element">
                                        <div className="categories">inspiration</div>
                                        <div className="social-links">
                                            <ul>
                                                <li>
                                                    <a href="#"><i className="icon icon-facebook"></i></a>
                                                </li>
                                                <li>
                                                    <a href="#"><i className="icon icon-twitter"></i></a>
                                                </li>
                                                <li>
                                                    <a href="#"><i className="icon icon-behance-square"></i></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>

                                </div>
                            </article>

                        </div>
                        <div className="col-md-4">

                            <article className="column" data-aos="fade-up" data-aos-delay="200">
                                <figure>
                                    <a href="#" className="image-hvr-effect">
                                        <img src="/images/post-img2.jpg" alt="post" className="post-image"/>
                                    </a>
                                </figure>
                                <div className="post-item">
                                    <div className="meta-date">Mar 29, 2021</div>
                                    <h3><a href="#">Reading books always makes the moments happy</a></h3>

                                    <div className="links-element">
                                        <div className="categories">inspiration</div>
                                        <div className="social-links">
                                            <ul>
                                                <li>
                                                    <a href="#"><i className="icon icon-facebook"></i></a>
                                                </li>
                                                <li>
                                                    <a href="#"><i className="icon icon-twitter"></i></a>
                                                </li>
                                                <li>
                                                    <a href="#"><i className="icon icon-behance-square"></i></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>

                                </div>
                            </article>

                        </div>
                        <div className="col-md-4">

                            <article className="column" data-aos="fade-up" data-aos-delay="400">
                                <figure>
                                    <a href="#" className="image-hvr-effect">
                                        <img src="/images/post-img3.jpg" alt="post" className="post-image"/>
                                    </a>
                                </figure>
                                <div className="post-item">
                                    <div className="meta-date">Feb 27, 2021</div>
                                    <h3><a href="#">Reading books always makes the moments happy</a></h3>

                                    <div className="links-element">
                                        <div className="categories">inspiration</div>
                                        <div className="social-links">
                                            <ul>
                                                <li>
                                                    <a href="#"><i className="icon icon-facebook"></i></a>
                                                </li>
                                                <li>
                                                    <a href="#"><i className="icon icon-twitter"></i></a>
                                                </li>
                                                <li>
                                                    <a href="#"><i className="icon icon-behance-square"></i></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>

                                </div>
                            </article>

                        </div>

                    </div>

                    <div className="row">

                        <div className="btn-wrap align-center">
                            <a href="#" className="btn btn-outline-accent btn-accent-arrow" tabindex="0">Read All Articles<i
                                className="icon icon-ns-arrow-right"></i></a>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </section>

    <section id="download-app" className="leaf-pattern-overlay">
        <div className="corner-pattern-overlay"></div>
        <div className="container">
            <div className="row justify-content-center">
                <div className="col-md-8">
                    <div className="row">

                        <div className="col-md-5">
                            <figure>
                                <img src="/images/device.png" alt="phone" className="single-image"/>
                            </figure>
                        </div>

                        <div className="col-md-7">
                            <div className="app-info">
                                <h2 className="section-title divider">Download our app now !</h2>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sagittis sed ptibus
                                    liberolectus nonet psryroin. Amet sed lorem posuere sit iaculis amet, ac urna.
                                    Adipiscing fames semper erat ac in suspendisse iaculis.</p>
                                <div className="google-app">
                                    <img src="/images/google-play.jpg" alt="google play"/>
                                        <img src="/images/app-store.jpg" alt="app store"/>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </section>

    <footer id="footer">
        <div className="container">
            <div className="row">

                <div className="col-md-4">

                    <div className="footer-item">
                        <div className="company-brand">
                            <img src="/images/main-logo.png" alt="logo" className="footer-logo"/>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sagittis sed ptibus liberolectus
                                    nonet psryroin. Amet sed lorem posuere sit iaculis amet, ac urna. Adipiscing fames
                                    semper erat ac in suspendisse iaculis.</p>
                        </div>
                    </div>

                </div>

                <div className="col-md-2">

                    <div className="footer-menu">
                        <h5>About Us</h5>
                        <ul className="menu-list">
                            <li className="menu-item">
                                <a href="#">vision</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">articles </a>
                            </li>
                            <li className="menu-item">
                                <a href="#">careers</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">service terms</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">donate</a>
                            </li>
                        </ul>
                    </div>

                </div>
                <div className="col-md-2">

                    <div className="footer-menu">
                        <h5>Discover</h5>
                        <ul className="menu-list">
                            <li className="menu-item">
                                <a href="#">Home</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">Books</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">Authors</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">Subjects</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">Advanced Search</a>
                            </li>
                        </ul>
                    </div>

                </div>
                <div className="col-md-2">

                    <div className="footer-menu">
                        <h5>My account</h5>
                        <ul className="menu-list">
                            <li className="menu-item">
                                <a href="#">Sign In</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">View Cart</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">My Wishtlist</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">Track My Order</a>
                            </li>
                        </ul>
                    </div>

                </div>
                <div className="col-md-2">

                    <div className="footer-menu">
                        <h5>Help</h5>
                        <ul className="menu-list">
                            <li className="menu-item">
                                <a href="#">Help center</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">Report a problem</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">Suggesting edits</a>
                            </li>
                            <li className="menu-item">
                                <a href="#">Contact us</a>
                            </li>
                        </ul>
                    </div>

                </div>

            </div>

        </div>
    </footer>

    <div id="footer-bottom">
        <div className="container">
            <div className="row">
                <div className="col-md-12">

                    <div className="copyright">
                        <div className="row">

                            <div className="col-md-6">
                                <p>© 2022 All rights reserved. Free HTML Template by <a
                                    href="https://www.templatesjungle.com/" target="_blank">TemplatesJungle</a></p>
                            </div>

                            <div className="col-md-6">
                                <div className="social-links align-right">
                                    <ul>
                                        <li>
                                            <a href="#"><i className="icon icon-facebook"></i></a>
                                        </li>
                                        <li>
                                            <a href="#"><i className="icon icon-twitter"></i></a>
                                        </li>
                                        <li>
                                            <a href="#"><i className="icon icon-youtube-play"></i></a>
                                        </li>
                                        <li>
                                            <a href="#"><i className="icon icon-behance-square"></i></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
      </>
  );
}

export default App;
