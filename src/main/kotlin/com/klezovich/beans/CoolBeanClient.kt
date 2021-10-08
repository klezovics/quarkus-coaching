package com.klezovich.beans

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CoolBeanClient(
    coolBean: MyCoolBean
) {
    init {
        println(coolBean.msg())
    }
}