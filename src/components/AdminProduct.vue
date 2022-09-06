<template>
    <Sidebar2 />
    <div class="title-text">
            <p>Add Product</p>
            <h1>Product Details</h1>
    </div>
    <div class="admintable">
        <table class="styled-table">
            <thead>
                <tr>
                    <th></th>
                    <th>Product Number</th>
                    <th>Product Name</th>
                    <th>Product Price</th>
                    <th><td style="color:#ffffff;cursor: pointer;"><i class="fa fa-plus fa-2x" aria-hidden="true" @click="route"></i></td></th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="product in products" :key="product.pNo">
                    <td><img :src="require(`@/assets/products/${product.pImg}`)" alt class="icon" style="width: 100px ;height: 100px;" /></td>
                    <td> {{product.pNo}} </td>
                    <td> {{ product.pName }} </td>
                    <td> <i class="fa fa-rupee"></i>{{ product.pPrice }} </td>
                    <td style="color:red;cursor: pointer;"><i class="fa fa-trash fa-2x" aria-hidden="true" @click="removeProduct(product)"></i></td>
                </tr>
            </tbody>   
        </table>
    </div>
    <Footer />
</template>

<script>
import axios from 'axios';
import Sidebar2 from "./Sidebar2.vue";
import Footer from "./AdminFooter.vue";
export default {
    name : 'Admin-Product',
    components :{
    Sidebar2,
    Footer
},
    data() {
        return{
            products : ''
        }
    },
    created() {
        this.showProducts();
    },
    methods : {
        async showProducts(){
            var pro = await axios.get("http://localhost:8282/getallproducts");
            this.products = pro.data;
        },
        route(){
            this.$router.push('/AddProduct')
        },
        async removeProduct(product){
            await axios.post("http://localhost:8282/dproducts",product);
            this.$router.push('/AdminProduct');
            this.showProducts();
        }
    }
}

</script>

<style>
.admintable {
    display: flex;
    align-items: center;
    justify-content: center;
    margin-top: 40px;
    margin-bottom: 168px;
}
.styled-table {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 900px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}
.styled-table thead tr {
    /* font-weight: bolder; */
    background-color: #009688;
    color: #ffffff;
    text-align: left;
}
.styled-table th{
    font-weight:bolder;
    font-size:medium;
    padding: 25px 70px;
}
.styled-table td {
    font-weight:bold;
    font-size: larger;
    padding: 12px 15px;
}
.styled-table tbody tr {
    border-bottom: 1px solid #dddddd;
    background-color: white;
}

.styled-table tbody tr:last-of-type {
    border-bottom: 2px solid #009688;
}
.styled-table tbody tr.active-row {
    font-weight: bold;
    color: #009879;
}
</style>