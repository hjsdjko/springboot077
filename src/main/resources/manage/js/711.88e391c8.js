"use strict";(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[711],{12711:(e,l,n)=>{n.r(l),n.d(l,{default:()=>_});n(63134),n(10307),n(39524);var t=n(67377),a=n(98479),o=n(91370),u=n(51290),i=function(e){return(0,t.dD)("data-v-a389f902"),e=e(),(0,t.Cn)(),e},r={class:"login_view"},s=i((function(){return(0,t._)("div",{class:"title_view"},"基于SpringBoot的农业收成管理系统登录",-1)})),v={key:0,class:"tabView"},c=["onClick"],d={key:1,class:"list_item"},f={key:2,class:"list_item"},m=["onKeydown"],p={class:"btn_view"};const g={__name:"login",setup:function(e){var l,n=(0,u.iH)([]),i=(0,u.iH)([]),g=(0,u.iH)({role:"",username:"",password:""}),w=(0,u.iH)(""),k=(0,u.iH)(1),_=null===(l=(0,t.FN)())||void 0===l?void 0:l.appContext.config.globalProperties,h=function(e){null===_||void 0===_||_.$router.push("/".concat(e,"Register"))},y=function(e){g.value.role=e},b=function(){if(g.value.username)if(g.value.password){if(n.value.length>1){if(!g.value.role)return null===_||void 0===_||_.$toolUtil.message("请选择角色","error"),void verifySlider.value.reset();for(var e=0;e<i.value.length;e++)i.value[e].roleName==g.value.role&&(w.value=i.value[e].tableName)}else w.value=n.value[0].tableName,g.value.role=n.value[0].roleName;U()}else null===_||void 0===_||_.$toolUtil.message("请输入密码","error");else null===_||void 0===_||_.$toolUtil.message("请输入用户名","error")},U=function(){null===_||void 0===_||_.$http({url:"".concat(w.value,"/login?username=").concat(g.value.username,"&password=").concat(g.value.password),method:"post"}).then((function(e){null===_||void 0===_||_.$toolUtil.storageSet("Token",e.data.token),null===_||void 0===_||_.$toolUtil.storageSet("role",g.value.role),null===_||void 0===_||_.$toolUtil.storageSet("sessionTable",w.value),null===_||void 0===_||_.$toolUtil.storageSet("adminName",g.value.username),null===_||void 0===_||_.$router.push("/")}),(function(e){}))},N=function(){var e={page:1,limit:1,sort:"id"};null===_||void 0===_||_.$http({url:"menu/list",method:"get",params:e}).then((function(e){i.value=JSON.parse(e.data.data.list[0].menujson);for(var l=0;l<i.value.length;l++)"是"==i.value[l].hasBackLogin&&n.value.push(i.value[l]);g.value.role=n.value[0].roleName,null===_||void 0===_||_.$toolUtil.storageSet("menus",JSON.stringify(i.value))}))},$=function(){N()};return(0,t.bv)((function(){$()})),function(e,l){var u=(0,t.up)("el-button"),i=(0,t.up)("el-form");return(0,t.wg)(),(0,t.iD)("div",null,[(0,t._)("div",r,[(0,t.Wm)(i,{model:g.value,class:"login_form"},{default:(0,t.w5)((function(){return[s,n.value.length>1?((0,t.wg)(),(0,t.iD)("div",v,[((0,t.wg)(!0),(0,t.iD)(t.HY,null,(0,t.Ko)(n.value,(function(e,l){return(0,t.wg)(),(0,t.iD)("div",{class:(0,a.C_)(["tab",g.value.role==e.roleName?"tabActive":""]),style:(0,a.j5)({width:"calc(100% / ".concat(n.value.length,")")}),key:l,onClick:function(l){return y(e.roleName)}},(0,a.zw)(e.roleName),15,c)})),128))])):(0,t.kq)("",!0),1==k.value?((0,t.wg)(),(0,t.iD)("div",d,[(0,t.wy)((0,t._)("input",{class:"list_inp","onUpdate:modelValue":l[0]||(l[0]=function(e){return g.value.username=e}),placeholder:"请输入账号"},null,512),[[o.nr,g.value.username]])])):(0,t.kq)("",!0),1==k.value?((0,t.wg)(),(0,t.iD)("div",f,[(0,t.wy)((0,t._)("input",{class:"list_inp","onUpdate:modelValue":l[1]||(l[1]=function(e){return g.value.password=e}),type:"password",placeholder:"请输入密码",onKeydown:(0,o.D2)(b,["enter","native"])},null,40,m),[[o.nr,g.value.password]])])):(0,t.kq)("",!0),(0,t._)("div",p,[1==k.value?((0,t.wg)(),(0,t.j4)(u,{key:0,class:"login",type:"success",onClick:b},{default:(0,t.w5)((function(){return[(0,t.Uk)("登录")]})),_:1})):(0,t.kq)("",!0),(0,t.Wm)(u,{class:"register",type:"primary",onClick:l[2]||(l[2]=function(e){return h("yonghu")})},{default:(0,t.w5)((function(){return[(0,t.Uk)("注册用户")]})),_:1}),(0,t.Wm)(u,{class:"register",type:"primary",onClick:l[3]||(l[3]=function(e){return h("shangjia")})},{default:(0,t.w5)((function(){return[(0,t.Uk)("注册商家")]})),_:1})])]})),_:1},8,["model"])])])}}};var w=n(57326);const k=(0,w.Z)(g,[["__scopeId","data-v-a389f902"]]),_=k}}]);
//# sourceMappingURL=711.88e391c8.js.map