import {createWebHistory,createRouter} from 'vue-router';
import Home from "./components/Home"
import SignIn from "./components/SignIn"
import SignUp from "./components/SignUp"
import Products from "./components/Products"
import Contact from "./components/Contact"
import Services from "./components/Services"
import Carts from "./components/Carts"
import Testimonials from "./components/Testimonials"
import Admin from "./components/Admin"
import AddProduct from "./components/AddProduct"
import AdminProduct from "./components/AdminProduct"
import Payment from "./components/Payment"
import AdminFooter from "./components/AdminFooter"
import HomeAll from "./components/HomeAll"

const routes = [
    {
        name:'HomeAll',
        path:'/',
        component:HomeAll
    },
    {
        name:'SignIn',
        path:'/SignIn',
        component:SignIn
    },
    {
        name:'Home',
        path:'/Home',
        component:Home
    },
    {
        name:'SignUp',
        path:'/SignUp',
        component:SignUp
    },
    {
        name:'Products',
        path:'/Products',
        component:Products
    },
    {
        name:'Contacts',
        path:'/Contacts',
        component:Contact
    },
    {
        name:'Services',
        path:'/Services',
        component:Services
    },
    {
        name:'Carts',
        path:'/Carts',
        component:Carts
    },
    {
        name:'Testimonials',
        path:'/Testimonials',
        component:Testimonials
    },
    {
        name:'Admin',
        path:'/Admin',
        component:Admin
    },
    {
        name:'AddProduct',
        path:'/AddProduct',
        component:AddProduct
    },
    {
        name:'AdminProduct',
        path:'/AdminProduct',
        component:AdminProduct
    },
    {
        name:'Payment',
        path:'/Payment',
        component:Payment
    },
    {
        name:'AdminFooter',
        path:'/AdminFooter',
        component:AdminFooter
    }
];

const router = createRouter({
    history:createWebHistory(),
    routes
});
export default router;