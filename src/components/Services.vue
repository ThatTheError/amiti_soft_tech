<template>
    <section id="service">
        <div class="title-text">
            <p>SERVICES</p>
            <h1>We Provide Better</h1>
        </div>
        <div class="service-box">
            <div class="single-service">
                <img src="../assets/images/pic-1.jpg">
                <div class="overlay"></div>
            </div>
            <div class="single-service">
                <img src="../assets/images/pic-2.jpg">
                <div class="overlay"></div>
            </div>
            <div class="single-service">
                <img src="../assets/images/pic-3.jpg">
                <div class="overlay"></div>
            </div>
            <div class="single-service">
                <img src="../assets/images/pic-4.jpg">
                <div class="overlay"></div>
            </div>
        </div>
    </section>
</template>

<script>
    export default {
        name:'Services-comp',
    }
</script>

<style>
    .title-text {
        text-align: center;
        padding-bottom: 70px;
    }
    .title-text p {
        margin: auto;
        font-size: 20px;
        color: #009688;
        font-weight: bold;
        position: relative;
        display: inline-block;
        z-index: 1;
    }
    .title-text p::after {
        content: '';
        width: 50px;
        height: 35px;
        background: linear-gradient(#019587,#fff);
        position: absolute;
        top: -20px;
        left: 0;
        z-index: -1;
        transform: rotate(10deg);
        border-top-left-radius: 35px;
        border-bottom-right-radius: 35px;
    }
    .title-text h1 {
        font-size: 50px;
    }
    #service {
        width: 100%;
        padding: 70px 0;
        background: #efefef;
    }
    .service-box {
        width: 80%;
        display: flex;
        flex-wrap: wrap;
        justify-content: space-around;
        margin: auto;
        position: relative
    }
    .single-service {
        flex-basis: 48%;
        text-align: center;
        border-radius: 7px;
        margin-bottom: 20px;
        color: #fff;
    }
    .single-service img {
        width: 100%;
        border-radius: 7px;
        
    }
    .overlay {
        width: 100%;
        height: 100%;
        position: absolute; 
        top: 0;
        border-radius: 7px;
        cursor: pointer;
        background: linear-gradient(rgba(0,0,0,0.5),#009688);
        opacity: 0;
        transition: 1s;
    }
    .single-service:hover .overlay {
        opacity: 1;
    }

</style>