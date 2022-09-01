<template>
    <Sidebar />
    <div class="title-text">
            <p>Payment</p>
            <h1>Payment Details</h1>
    </div>
    <header>
        <div class="container-payment">
            <div class="left">
                <h3>BILLING ADDRESS</h3>
                <div class="payment">
                    Full name
                    <input type="text" name="" placeholder="Enter name" required>
                    Email
                    <input type="text" name="" placeholder="Enter email" required>

                    Address
                    <input type="text" name="" placeholder="Enter address" required>
                    
                    City
                    <input type="text" name="" placeholder="Enter City" required>
                    State
                    <input type="text" name="" placeholder="State" required>
                    Zip code
                    <input type="text" name="" placeholder="Zip code" required>
                </div>
            </div>
            <div class="right">
                <h3>PAYMENT</h3>
                <div class="payment">
                    Accepted Card <br>
                    <img src="../assets/images/card1.png" width="100">
                    <img src="../assets/images/card2.png" width="50">
                    <br><br>

                    Credit card number
                <input type="text" name="" placeholder="Enter card number" required>
                    
                    Exp month
                    <input type="text" name="" placeholder="Enter Month" required>
                    <div id="zip">
                        <label>
                            Exp year
                            <select>
                                <option>Choose Year..</option>
                                <option>2022</option>
                                <option>2023</option>
                                <option>2024</option>
                                <option>2025</option>
                            </select>
                        </label>
                            <label>
                            CVV
                            <input type="number" name="" placeholder="CVV" required>
                        </label>
                    </div>
                </div>
                <input type="submit" name="" value="Proceed to Checkout" @click="paymentDone" >
            </div>
        </div>
    </header>
    <Footer />
</template>

<script>



import Sidebar from './Sidebar.vue';
import Footer from './Footer.vue';
export default {
    name : 'payment-comp',
    components : {
        Sidebar,
        Footer
    },
    methods : {
        paymentDone(){
            alert("thank you for shopping with us");
            this.$router.push('/Home');
        }
    }
}






</script>




<style>
header{
    margin-top: -190px;
    margin-bottom: -72px;
    width: 100vw;
    min-height: 100vh;
    font-size: 1.2rem;
    display: flex;
    justify-content: center;
    align-items: center;
}
.container-payment{
	background: white;
	max-width: 800px;
	min-height: 500px;
	display: flex;
	justify-content:space-between;
	align-items: flex-start;
	padding: 0.5rem 1.5rem;
}
.left{
	flex-basis: 50%;
    padding: 10px;
}
.right{
    padding: 10px;
	flex-basis: 50%;
}
.payment{
	padding: 1rem;
}
h3{
	margin-top: 1rem;
	color:#009688;
	}
.payment input[type="text"]{
	width: 100%;
	padding: 0.5rem 0.7rem;
	margin: 0.5rem 0;
	outline: none;
}
#zip{
	display: flex;
	margin-top: 0.5rem;
}
.payment #zip select{
	padding: 0.5rem 0.7rem;
}
.payment #zip input[type="number"]{
	padding: 0.5rem 0.7rem;
	margin-left: 5px;	
}
input[type="submit"]{
	width: 100%;
	padding: 0.7rem 1.5rem;
	background: #009688;
	color: white;
	border: none;
	outline: none;
	margin-top: 2.8rem;
	cursor: pointer;
    margin-left: 12px;
}
input[type="submit"]:hover{
	background: #2c3e50;
}
</style>