package com.hhz.flink.cep.pojo

class Pojos {}
case class LoginEvent( userId: Long, ip: String, eventType: String, eventTime: Long )
case class Warning( userId: Long, firstFailTime: Long, lastFailTime: Long, warningMsg: String)