<template>
    <Sidebar />
    <div class="title-text">
            <p>Testimonials</p>
            <h1>Happy Customer's</h1>
    </div>
    <div class="testimonials">
        <div class="inner">
            <div class="row">
                <div class="col">
                    <div class="testimonial">
                        <img src="../assets/customers/c1.jpeg" alt="" />
                        <div class="name">V Gopal Krushna Patro</div>
                        <div class="starts">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star-o"></i>
                            <i class="fa fa-star-o"></i>
                        </div>
                        <p>
                            Well trained professionals. A unisex salon which caters all your needs. if u want some creative haircut or makeover then i will recommend you to here and check out their Services. Thanks Indian HariLine .
                        </p>
                    </div>
                </div>

                <div class="col">
                    <div class="testimonial">
                        <img src="../assets/customers/c2.jpg" alt="" />
                        <div class="name">Siba Sankar Maharana</div>
                        <div class="starts">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star-o"></i>
                        </div>
                        <p>
                            Very good hair care products with pocket friendly prices they are selling there own organic brands with iso certified . highly recommended products with no side effects. Thanks Indian HairLine :)
                        </p>
                    </div>
                </div>

                <div class="col">
                    <div class="testimonial">
                        <img src="../assets/customers/c4.jpg" alt="" />
                        <div class="name">Ram Prasad Majhi</div>
                        <div class="starts">
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                            <i class="fa fa-star"></i>
                        </div>
                        <p>
                            Ambience is really good . Service is 'A' class . There are so many beauty and hair style services with products. visit once you can feel the difference. Highly impressed Thank you Indian Hairline.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <Footer />
</template>

<script>
    import Sidebar from "./Sidebar.vue"
    import Footer from "./Footer.vue"
    export default {
        name: 'Testimonials-comp',
        components : {
            Sidebar,
            Footer
        }
    }
</script>

<style>
    *{
        margin: 0;
        padding: 0;
        font-family: "montesserat",sans-serif;
    }
    .testimonials{
        padding: 40px;
        background: #f1f1f1;
        color: #434343;
        text-align: center;
        margin-bottom: 120px;
    }
    .inner {
        max-width: 1200px;
        margin: auto;
        overflow: hidden;
        padding: 0 20px;
    }
    .border {
        width: 160px;
        height: 5px;
        background: #6ab04c;
        margin: 26px auto;
    }
    .row {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
    }
    .col {
        flex: 33.33%;
        max-width: 33.33%;
        box-sizing: border-box;
        padding: 15px;
    }
    .testimonial {
        background: #fff;
        padding: 30px;
    }
    .testimonial img {
        width: 100px;
        height: 100px;
        border-radius: 50%;
    }
    .name {
        font-size: 20px;
        text-transform: uppercase;
        margin: 20px 0;
    }
    .starts {
        color: #019587;
        margin-bottom: 20px;
    }
</style>