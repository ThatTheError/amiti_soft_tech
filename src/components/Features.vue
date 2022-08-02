<template>
    <section id="features">
        <div class="title-text">
            <p>Features</p>
            <h1>Why Choose Us ?</h1>
        </div>
        <div class="feature-box">
            <div class="feature">
                <h1>Experienced Staff</h1>
                <div class="feature-desc">
                    <div class="feature-icon">
                        <i class="fa fa-shield"></i>
                    </div>
                    <div class="feature-text">
                        <p>kdsvsiosdo shiehfihsiehfi wseif hiwhif iw ir hfi hwie hif iw e hfi hwie hi ifw oe fo woi</p>
                    </div>
                </div>
                <h1>Pre Booking Online</h1>
                <div class="feature-desc">
                    <div class="feature-icon">
                        <i class="fa fa-check-square-o"></i>
                    </div>
                    <div class="feature-text">
                        <p>kdsvsiosdo shiehfihsiehfi wseif hiwhif iw ir hfi hwie hif iw e hfi hwie hi ifw oe fo woi</p>
                    </div>
                </div>
                <h1>Affordable Cost</h1>
                <div class="feature-desc">
                    <div class="feature-icon">
                        <i class="fa fa-inr"></i>
                    </div>
                    <div class="feature-text">
                        <p>kdsvsiosdo shiehfihsiehfi wseif hiwhif iw ir hfi hwie hif iw e hfi hwie hi ifw oe fo woi</p>
                    </div>
                </div>
            </div>
            <div class="feature-img">
                <img src="../assets/images/barber-man.jpg">
            </div>
        </div>
    </section>
</template>

<script>
    export default{
        name:'Features-comp'
    }

</script>

<style>
    *{
        padding: 0;
        margin: 0;  
    }
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
        color: #009688;
    }
    #features {
        width: 100%;
        padding: 70px 0;
        background: #efefef;
    }
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
    .feature-box {
        width: 80%;
        margin: auto;
        display: flex;
        flex-wrap: wrap;
        align-items: center;
        text-align: center;
    }
    .feature {
        flex-basis: 50%;
    }
    .feature-img {
        flex-basis: 50%;
        margin: auto;
    }
    .feature-img img {
        width: 70%;
        border-radius: 10px;
    }
    .feature h1 {
        text-align: left;
        margin-bottom: 10px;
        font-weight: 100;
        color: 009688;
    }
    .feature-desc {
        display: flex;
        align-items: center;
        margin-bottom: 40px;
    }
    .feature-icon .fa {
        width: 50px;
        height: 50px;
        font-size: 30px;
        line-height: 50px;
        border-radius: 8px;
        color: #009688;
        border: 1px solid;
    }
    .feature-text p{
        padding: 0 20px;
        text-align: initial;
    }
</style>