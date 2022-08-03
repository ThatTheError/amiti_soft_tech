<template>
    <footer class="footer-distributed">

        <div class="footer-left">
            <h3>Indian<span>HairLine</span></h3>

            <p class="footer-links">
                <a v-on:click="$router.push('/Home')">Home</a>
                |
                <a v-on:click="$router.push('/Contact')">Contact</a>
                |
                <a v-on:click="$router.push('/Products')">Products</a>
            </p>

            <p class="footer-company-name">Copyright © 2022 <strong>Indian HairLine</strong> All rights reserved</p>
        </div>

        <div class="footer-center">
            <div>
                <i class="fa fa-map-marker"></i>
                <p><span>Berhampur</span>
                    Odisha</p>
            </div>

            <div>
                <i class="fa fa-phone"></i>
                <p>+91 9078280314</p>
            </div>
            <div>
                <i class="fa fa-envelope"></i>
                <p><a href="mailto:gopal@amiti.in">gopal@amiti.in</a></p>
            </div>
        </div>
        <div class="footer-right">
            <p class="footer-company-about">
                <span>About the company</span>
                <strong>Indian HairLine</strong>is one of the earliest and the finest hair and beauty salons in India. 
                Through these years, we have won the trust of several celebrities and millions of commoners who are our loyal patrons today. 
                Besides this, we also help aspiring stylists achieve their dreams, Operating in 24 states and 110 cities in the country, 
                we currently have 875 outlets in addition to establishments in Singapore, Kenya, Dubai, Bangladesh, Nepal.
                Through our professional services, we relentlessly strive to give our customers an experience that they would love to revisit.
            </p>
            <div class="footer-icons">
                <a href="https://ne-np.facebook.com/people/V-Gopal-Krushna-Patro/"><i class="fa fa-facebook"></i></a>
                <a href="https://www.instagram.com/heartieshh/"><i class="fa fa-instagram"></i></a>
                <a href="https://www.linkedin.com/in/v-gopal-krushna-patro-2906a8165/"><i class="fa fa-linkedin"></i></a>
                <a href="https://twitter.com/vgopalkrushnap1"><i class="fa fa-twitter"></i></a>
                <a href="https://www.youtube.com/"><i class="fa fa-youtube"></i></a>
            </div>
        </div>
    </footer>
</template>
<script>
    export default {
        name:'Footer-comp'
    }
</script>

<style>
@import url('http://fonts.googleapis.com/css?family=Open+Sans:400,700');
* {
    padding: 0;
    margin: 0;
}

body {
    font-family: 'Poppins', sans-serif;
}

html {
    background-color: #eaf0f2;
}

header {
    text-align: center;
    padding-top: 100px;
    margin-bottom: 300px;
    font-size: 35px;
}

header h2 {
    color: #f0525f;
}

header span {
    color: #eaa03f;
}

/* The footer is fixed to the bottom of the page */

footer {
    position:relative;
    bottom: 0;
}

@media (max-height:800px) {
    footer {
        position: static;
    }
    header {
        padding-top: 40px;
    }
}

.footer-distributed {
    background-color: #2d2a30;
    box-sizing: border-box;
    width: 100%;
    text-align: left;
    font: bold 16px sans-serif;
    padding: 50px 50px 60px 50px;
}
.footer-distributed .footer-left, .footer-distributed .footer-center, .footer-distributed .footer-right {
    display: inline-block;
    vertical-align: top;
}

/* Footer left */

.footer-distributed .footer-left {
    width: 30%;
}

.footer-distributed h3 {
    color: #ffffff;
    font: normal 36px 'Cookie', cursive;
    margin: 0;
}


.footer-distributed h3 span {
    color: #e0ac1c;
}

/* Footer links */

.footer-distributed .footer-links {
    color: #ffffff;
    margin: 20px 0 12px;
    cursor: pointer;
}

.footer-distributed .footer-links a {
    display: inline-block;
    line-height: 1.8;
    text-decoration: none;
    color: inherit;
}

.footer-distributed .footer-company-name {
    color: #8f9296;
    font-size: 14px;
    font-weight: normal;
    margin: 0;
}

/* Footer Center */

.footer-distributed .footer-center {
    width: 35%;
}

.footer-distributed .footer-center i {
    background-color: #33383b;
    color: #ffffff;
    font-size: 25px;
    width: 38px;
    height: 38px;
    border-radius: 50%;
    text-align: center;
    line-height: 42px;
    margin: 10px 15px;
    vertical-align: middle;
}

.footer-distributed .footer-center i.fa-envelope {
    font-size: 17px;
    line-height: 38px;
}

.footer-distributed .footer-center p {
    display: inline-block;
    color: #ffffff;
    vertical-align: middle;
    margin: 0;
}

.footer-distributed .footer-center p span {
    display: block;
    font-weight: normal;
    font-size: 14px;
    line-height: 2;
}

.footer-distributed .footer-center p a {
    color: #e0ac1c;
    text-decoration: none;
}

/* Footer Right */

.footer-distributed .footer-right {
    width: 30%;
}

.footer-distributed .footer-company-about {
    line-height: 20px;
    color: #92999f;
    font-size: 13px;
    font-weight: normal;
    margin: 0;
}

.footer-distributed .footer-company-about span {
    display: block;
    color: #ffffff;
    font-size: 18px;
    font-weight: bold;
    margin-bottom: 20px;
}

.footer-distributed .footer-icons {
    margin-top: 25px;
}

.footer-distributed .footer-icons a {
    display: inline-block;
    width: 35px;
    height: 35px;
    cursor: pointer;
    background-color: #33383b;
    border-radius: 2px;
    font-size: 20px;
    color: #ffffff;
    text-align: center;
    line-height: 35px;
    margin-right: 3px;
    margin-bottom: 5px;
}

.footer-distributed .footer-icons a:hover {
    background-color: #3F71EA;
}

.footer-links a:hover {
    color: #3F71EA;
}

@media (max-width: 880px) {
    .footer-distributed .footer-left, .footer-distributed .footer-center, .footer-distributed .footer-right {
        display: block;
        width: 100%;
        margin-bottom: 40px;
        text-align: center;
    }
    .footer-distributed .footer-center i {
        margin-left: 0;
    }
}       
        
</style>