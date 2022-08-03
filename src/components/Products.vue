<template>
    <Sidebar />
    <section id="product">
            <div class="title-text">
                <p>PRODUCTS</p>
                <h1>Shop Our Best Products</h1>
            </div>
            <div class="container">
                <div class="image">
                    <img src="../assets/products/p1.jpg" alt="Hair Serum">
                    <h3>Hair Serum</h3>
                    <h3>$17.0</h3>
                    <button class="add-cart cart1" v-on:click="cartNumbers(products[0])">Add Cart</button>
                </div>
                <div class="image">
                    <img src="../assets/products/p2.jpg" alt="Dry Shampoo">
                    <h3>Dry Shampoo</h3>
                    <h3>$14.0</h3>
                    <button class="add-cart cart2" v-on:click="cartNumbers(products[1])">Add Cart</button>
                </div>
                <div class="image">
                    <img src="../assets/products/p3.jpg" alt="Hair Color">
                    <h3>Hair Color</h3>
                    <h3>$09.0</h3>
                    <button class="add-cart cart3" v-on:click="cartNumbers(products[2])">Add Cart</button>
                </div>
                <div class="image">
                    <img src="../assets/products/p4.jpg" alt="Hair Mask">
                    <h3>Hair Mask</h3>
                    <h3>$11.0</h3>
                    <button class="add-cart cart4" v-on:click="cartNumbers(products[3])">Add Cart</button>
                </div>
                <div class="image">
                    <img src="../assets/products/p5.jpg" alt="Hair Cream">
                    <h3>Hair Cream</h3>
                    <h3>$22.0</h3>
                    <button class="add-cart cart5" v-on:click="cartNumbers(products[4])">Add Cart</button>
                </div>
                <div class="image">
                    <img src="../assets/products/p6.jpg" alt="Hair Wax">
                    <h3>Hair Wax</h3>
                    <h3>$24.0</h3>
                    <button class="add-cart cart6" v-on:click="cartNumbers(products[5])">Add Cart</button>
                </div>
                <div class="image">
                    <img src="../assets/products/p7.jpg" alt="Hair Gel">
                    <h3>Hair Gel</h3>
                    <h3>$07.0</h3>
                    <button class="add-cart cart7" v-on:click="cartNumbers(products[6])">Add Cart</button>
                </div>
                <div class="image">
                    <img src="../assets/products/p8.jpg" alt="Hair Spray">
                    <h3>Hair Spray</h3>
                    <h3>$27.0</h3>
                    <button class="add-cart cart8" v-on:click="cartNumbers(products[7])">Add Cart</button>
                    <input type="hidden" value="10">
                </div>
                <div class="image">
                    <img src="../assets/products/p9.jpg" alt="Beardo Oil">
                    <h3>Beardo Oil</h3>
                    <h3>$19.0</h3>
                    <button class="add-cart cart9" v-on:click="cartNumbers(products[8])">Add Cart</button>
                </div>
            </div>
        </section>
        <Footer />
</template>


<script>
    import Sidebar from './Sidebar.vue'
    import Footer from './Footer.vue'
    export default {
        name :'Products-comp',
        components: {
            Sidebar,
            Footer
        },
        data() {
            return {
                products : [
                {
                    name: 'Hair Serum',
                    tag: 'Hair Serum',
                    price: 17,
                    inCart: 0,
                    pno: 1
                },
                {
                    name: 'Dry Shampoo',
                    tag: 'Dry Shampoo',
                    price: 14,
                    inCart: 0,
                    pno: 2
                },
                {
                    name: 'Hair Color',
                    tag: 'Hair Color',
                    price: 9,
                    inCart: 0,
                    pno: 3
                    
                },
                {
                    name: 'Hair Mask',
                    tag: 'Hair Mask',
                    price: 11,
                    inCart: 0,
                    pno: 4
                },
                {
                    name: 'Hair Cream',
                    tag: 'Hair Cream',
                    price: 22,
                    inCart: 0,
                    pno: 5
                },
                {
                    name: 'Hair Wax',
                    tag: 'Hair Wax',
                    price: 24,
                    inCart: 0,
                    pno: 6
                },
                {
                    name: 'Hair Gel',
                    tag: 'Hair Gel',
                    price: 7,
                    inCart: 0,
                    pno: 7
                },
                {
                    name: 'Hair Spray',
                    tag: 'Hair Spray',
                    price: 27,
                    inCart: 0,
                    pno: 8
                },
                {
                    name: 'Beardo Oil',
                    tag: 'Beardo Oil',
                    price: 19,
                    inCart: 0,
                    pno: 9
                }
                ]
            }
        },
        methods: {
            cartNumbers(product) {
                let productNumbers = localStorage.getItem("cartNumbers");
                productNumbers = parseInt(productNumbers);
                if(productNumbers){
                    localStorage.setItem('cartNumbers',productNumbers+1);
                }else{
                    localStorage.setItem("cartNumbers" , 1);
                }
                this.setItems(product);
                this.totalCost(product);
            },
            setItems(product){
                let cartItems = localStorage.getItem('productsInCart');
                cartItems = JSON.parse(cartItems);
                if(cartItems != null){
                    if(cartItems[product.tag] == undefined) {
                        cartItems = {
                            ...cartItems,
                            [product.tag] : product
                        }
                    }
                    cartItems[product.tag].inCart += 1;
                }else {
                    product.inCart = 1;
                    cartItems = {
                        [product.tag] : product
                    }
                }
                localStorage.setItem("productsInCart", JSON.stringify(cartItems));
            },
            totalCost(product) {
                let cartCost = localStorage.getItem('totalCost');
                cartCost =  parseInt(cartCost);
                if(!cartCost) {
                    cartCost = product.price;
                }
                else{
                    cartCost += product.price;
                }
                localStorage.setItem('totalCost',cartCost);
            }
        }
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
        color: #009688;
    }
    #product {
        width: 100%;
        padding: 70px 0;
        background: #efefef;
    }
    .container {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        margin-top: 50px;
        padding-bottom: 100px;
    }
    .image {
        width: 300px;
        height: 310px;
        margin: 60px 100px;
        position: relative;
        overflow: hidden;
        border: solid 0.2px #009688;
        background: linear-gradient(rgba(0,0,0,0.5),#009688);
        border-radius: 9px;
    }
    .image img {
        margin: auto;
        width: 100%;
        height: 70%;
        background-color: #009688;
    }
    .image button{
        height: 31px;
        font-family: cursive;
        background-color: #fff;
        color: #019587;
        text-decoration: none;
        text-align: center;
        font-weight: bolder;
        margin: 0 80px;
        padding: 4px 31px;
        display: inline-block;
        border: 3px solid white;
        border-radius: 8px;
        cursor: pointer;
    }
    .add-cart:hover {
        background-color: whitesmoke;
        color: #009688;
    }
    .image h3 {
        margin-left: 9px;
        margin-top: 6px;
        font-family: Arial, Helvetica, sans-serif;
        color: #efefef;
    }
</style>