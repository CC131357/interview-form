package com.liwinon.interviewform.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Service
public class mainServiceImpl implements mainService {
    //保存职员
    @Override
    public Map<String,String> saveinfo(HttpServletRequest request) {
        Map<String,String> data = new HashMap<>();
        //姓名
        String iname0 = request.getParameter("iname").trim();
        data.put("iname0",iname0);
        data.put("iname2",iname0);
        //电话
        String phone0 = request.getParameter("phone0").trim();
        data.put("phone0",phone0);
        //String post0 = request.getParameter("post").trim();
        //data.put("post0",post0);
        //应聘日期
        String postDate0 = request.getParameter("postDate0").trim();
        data.put("postDate0",postDate0);
        //性别
        String sex = request.getParameter("sex").trim();
        data.put("sex",sex);
        //出生日期
        String borndate = request.getParameter("date2").trim();
        data.put("borndate",borndate);
        //身高
        String iheight = request.getParameter("iheight").trim();
        data.put("iheight",iheight);
        //体重
        String iweight = request.getParameter("iweight").trim();
        data.put("iweight",iweight);
        //视力
        String eyes = request.getParameter("eyes").trim();
        data.put("eyes",eyes);
        //籍贯
        String nativePlace = request.getParameter("nativePlace").trim();
        data.put("nativePlace",nativePlace);
        //民族
        String nation = request.getParameter("nation").trim();
        data.put("nation",nation);
        String faith = request.getParameter("faith");
/*        if (faith==null||faith==""){
            data.put("faith","无");
        }else{
            data.put("faith",faith.trim());
        }*/
/*        String education = request.getParameter("education").trim();
        data.put("education0",education);*/
        /*String identity = request.getParameter("identity").trim();
        data.put("identity",identity);*/
        //婚姻状况
        String marriage = request.getParameter("marriage").trim();
        data.put("marriage",marriage);
        //身份证号
        String idcard = request.getParameter("idcard").trim();
        data.put("idcard",idcard);
        //既往病史
        String medicalhistory = request.getParameter("medicalhistory").trim();
        data.put("medicalhistory",medicalhistory);
        //现住地址
        String address = request.getParameter("address").trim();
        data.put("address",address);
        //金融社保卡
        String fcard = request.getParameter("fcard").trim();
        data.put("fcard",fcard);
        //公积金卡
        String pcard = request.getParameter("pcard").trim();
        data.put("pcard",pcard);

        String[] family1 = request.getParameterValues("family1");
        String member1 = family1[0];
        String relation1 = family1[1];
        String phone2 = family1[2];
        String place1 = family1[3];
        data.put("member1",member1);
        data.put("relation1",relation1);
        data.put("phone2",phone2);
        data.put("place1",place1);
        String[] family2 = request.getParameterValues("family2");
        String member2 = "";
        String relation2 = "";
        String phone3 = "";
        String place2 = "";
        if (family2!=null && family2.length>0){
            member2 = family2[0];
            relation2 = family2[1];
            phone3 = family2[2];
            place2 = family2[3];
        }
        data.put("member2",member2);
        data.put("relation2",relation2);
        data.put("phone3",phone3);
        data.put("place2",place2);

        String[] family3 = request.getParameterValues("family3");
        String member3 = "";
        String relation3 = "";
        String phone4 = "";
        String place3 = "";
        if (family3!=null && family3.length>0){
            member3 = family3[0];
             relation3 = family3[1];
            phone4 = family3[2];
             place3 = family3[3];
        }
        data.put("member3",member3);
        data.put("relation3",relation3);
        data.put("phone4",phone4);
        data.put("profession3",place3);

        String[] friend1 = request.getParameterValues("friend1");
        String name4 = "";
        String department1 =  "";
        String position1 =  "";
        String phone5 = "";
        String relation4 = "";
        if (friend1!=null && friend1.length>0){
             name4 = friend1[0];
             department1 = friend1[1];
             position1 = friend1[2];
            phone5 = friend1[3];
             relation4 = friend1[4];
        }
        data.put("name4",name4);
        data.put("department1",department1);
        data.put("position1",position1);
        data.put("phone5",phone5);
        data.put("relation4",relation4);

        String[] friend2 = request.getParameterValues("friend2");
        String name5 = "";
        String department2 =  "";
        String position2 =  "";
        String phone6 = "";
        String relation5 = "";
        if (friend2!=null && friend2.length>0){
             name5 = friend2[0];
             department2 = friend2[1];
             position2 = friend2[2];
            phone6 = friend2[3];
             relation5 = friend2[4];

        }
        data.put("name5",name5);
        data.put("department2",department2);
        data.put("position2",position2);
        data.put("phone6",phone6);
        data.put("relation5",relation5);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//接收格式
        SimpleDateFormat value = new SimpleDateFormat("yyyy/MM");//设置格式
        /*开始处理教育经历*/
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
        String school1 = request.getParameter("school1");
        if(school1!=null && school1!=""){
            data.put("school1",school1.trim());
        }else{
            data.put("school1","");
        }
        //
        String scdate11 = request.getParameter("scdate11");
        String date2 = "";
        if(scdate11!=null && scdate11!=""){
            try {
                date2  = value.format(sdf1.parse(scdate11));
                String scdate12 = request.getParameter("scdate12");
                date2 = date2 +"-" + value.format(sdf1.parse(scdate12));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date2",date2);
        //专业
        String major1 = request.getParameter("major1");
        if(major1!=null && major1!=""){
            data.put("major1",major1.trim());
        }else{
            data.put("major1","");
        }
        //学历
        String education1 = request.getParameter("education1");
        if(education1!=null && education1!=""){
            data.put("education1",education1.trim());
        }else{
            data.put("education1","");
        }
        //教育类型
        String aDegree1 = request.getParameter("aDegree1");
        if(aDegree1!=null && aDegree1!=""){
            data.put("aDegree1",aDegree1.trim());
        }else{
            data.put("aDegree1","");
        }
        String landscape = request.getParameter("landscape");
        if(landscape!=null && landscape!=""){
            data.put("landscape",landscape.trim());
        }else{
            data.put("landscape","");
        }

        /*教育经历2*/
       /* String school2 = request.getParameter("school2");
        if(school2!=null && school2!=""){
            data.put("school2",school2.trim());
        }else{
            data.put("school2","");
        }
        String scdate21 = request.getParameter("scdate21");
        String date3 = "";
        if(scdate21!=null && scdate21!=""){
            try {
                date3  = value.format(sdf.parse(scdate21));
                String scdate22 = request.getParameter("scdate22");
                date3 = date3 +"-" + value.format(sdf.parse(scdate22));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date3",date3);
        String major2 = request.getParameter("major2");
        if(major2!=null && major2!=""){
            data.put("major2",major2.trim());
        }else{
            data.put("major2","");
        }
        String education2 = request.getParameter("education2");
        if(education2!=null && education2!=""){
            data.put("education2",education2.trim());
        }else{
            data.put("education2","");
        }
        String aDegree2 = request.getParameter("aDegree2");
        if(aDegree2!=null && aDegree2!=""){
            data.put("aDegree2",aDegree2.trim());
        }else{
            data.put("aDegree2","");
        }
        String school3 = request.getParameter("school3");
        if(school3!=null && school3!=""){
            data.put("school3",school3.trim());
        }else{
            data.put("school3","");
        }
        String scdate31 = request.getParameter("scdate31");
        String date4 = "";
        if(scdate31!=null && scdate31!=""){
            try {
                date4  = value.format(sdf.parse(scdate31));
                String scdate32 = request.getParameter("scdate32");
                date4 = date4 +"-" + value.format(sdf.parse(scdate32));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date4",date4);
        String major3 = request.getParameter("major3");
        if(major3!=null && major3!=""){
            data.put("major3",major3.trim());
        }else{
            data.put("major3","");
        }
        String education3 = request.getParameter("education3");
        if(education3!=null && education3!=""){
            data.put("education3",education3.trim());
        }else{
            data.put("education3","");
        }
        String aDegree3 = request.getParameter("aDegree3");
        if(aDegree3!=null && aDegree3!=""){
            data.put("aDegree3",aDegree3.trim());
        }else{
            data.put("aDegree3","");
        }*/
        /*结束 教育经历*/
        /*开始 培训经历*/

        String train1 = request.getParameter("train1");
        if(train1!=null && train1!=""){
            data.put("train1",train1.trim());
        }else{
            data.put("train1","");
        }
        String tdate1 = request.getParameter("tdate1");
        String date8 = "";
        if(tdate1!=null && tdate1!=""){
            try {

                date8  = value.format(sdf1.parse(tdate1));
                String tdate2 = request.getParameter("tdate2");
                date8 = date8 +"-" + value.format(sdf1.parse(tdate2));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date8",date8);
        String content1 = request.getParameter("content1");
        if(content1!=null && content1!=""){
            data.put("content1",content1.trim());
        }else{
            data.put("content1","");
        }
        String course1 = request.getParameter("course1");
        if(course1!=null && course1!=""){
            data.put("course1",course1.trim());
        }else{
            data.put("course1","");
        }
        /*培训经历2*/
        String train2 = request.getParameter("train2");
        if(train2!=null && train2!=""){
            data.put("train2",train2.trim());
        }else{
            data.put("train2","");
        }
        String tdate3 = request.getParameter("tdate3");
        String date9 = "";
        if(tdate3!=null && tdate3!=""){
            try {
                date9  = value.format(sdf.parse(tdate3));
                String tdate4 = request.getParameter("tdate4");
                date9 = date9 +"-" + value.format(sdf.parse(tdate4));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date9",date9);
        String course2 = request.getParameter("course2");
        if(course2!=null && course2!=""){
            data.put("course2",course2.trim());
        }else{
            data.put("course2","");
        }
        String content2 = request.getParameter("content2");
        if(content2!=null && content2!=""){
            data.put("content2",content2.trim());
        }else{
            data.put("content2","");
        }
        String train3 = request.getParameter("train3");
        if(train3!=null && train3!=""){
            data.put("train3",train3.trim());
        }else{
            data.put("train3","");
        }
        String tdate5 = request.getParameter("tdate5");
        String dates1 = "";
        if(tdate5!=null && tdate5!=""){
            try {
                dates1  = value.format(sdf.parse(tdate5));
                String tdate6 = request.getParameter("tdate6");
                dates1 = dates1 +"-" + value.format(sdf.parse(tdate6));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("dates1",dates1);
        String course3 = request.getParameter("course3");
        if(course3!=null && course3!=""){
            data.put("course3",course3.trim());
        }else{
            data.put("course3","");
        }
        String content3 = request.getParameter("content3");
        if(content3!=null && content3!=""){
            data.put("content3",content3.trim());
        }else{
            data.put("content3","");
        }
        String enlevel = request.getParameter("enlevel");
        if(enlevel!=null && enlevel!=""){
            data.put("enlevel",enlevel.trim());
        }else{
            data.put("enlevel","");
        }
        String otherLevel = request.getParameter("otherLevel");
        if(otherLevel!=null && otherLevel!=""){
            data.put("otherLevel",otherLevel.trim());
        }else{
            data.put("otherLevel","");
        }
        /*爱好*/
        String hobby = request.getParameter("hobby").trim();
        if(hobby!=null && hobby!=""){
            data.put("hobby",hobby.trim());
        }else{
            data.put("hobby","");
        }
        /*特长*/
        String special = request.getParameter("special").trim();
        if(special!=null && special!=""){
            data.put("special",special.trim());
        }else{
            data.put("special","");
        }
        String smoke = request.getParameter("smoke").trim();
        if(smoke!=null && smoke!=""){
            data.put("smoke",smoke.trim());
        }else{
            data.put("smoke","");
        }

        /*开始 工作经历*/
        String[] experience1 = request.getParameterValues("experience1");
        String startdate1 = "";
        String enddate1 = "";
        String company1 = "";
        String workduty1 =  "";
        String salary1 = "";
        String people1 = "";
        String telphone1 = "";
        String reason1= "";
        if (experience1!=null && experience1.length>0){
            startdate1 = experience1[0];
            enddate1 = experience1[1];
            company1 = experience1[2];
            workduty1 = experience1[3];
            salary1 = experience1[4];
            people1 = experience1[5];
            telphone1 = experience1[6];
            reason1 = experience1[7];
        }
        data.put("startdate1",startdate1);
        data.put("enddate1",enddate1);
        data.put("company1",company1);
        data.put("workduty1",workduty1);
        data.put("salary1",salary1);
        data.put("people1",people1);
        data.put("telphone1",telphone1);
        data.put("reason1",reason1);

        /*工作经历2*//*
        String[] experience2 = request.getParameterValues("experience2");
        String startdate2 = "";
        String enddate2 = "";
        String company2 = "";
        String workduty2 =  "";
        String salary2 = "";
        String people2 = "";
        String telphone2 = "";
        String reason2= "";
        if (experience2!=null && experience2.length>0){
            startdate2 = experience1[0];
            enddate2 = experience1[1];
            company2 = experience1[2];
            workduty2 = experience1[3];
            salary2 = experience1[4];
            people2 = experience1[5];
            telphone2 = experience1[6];
            reason2 = experience1[7];
        }
        data.put("startdate2",startdate2);
        data.put("enddate2",enddate2);
        data.put("company2",company2);
        data.put("workduty2",workduty2);
        data.put("salary2",salary2);
        data.put("people2",people2);
        data.put("telphone2",telphone2);
        data.put("reason2",reason2);

        *//*工作经历3*//*

        String[] experience3 = request.getParameterValues("experience3");
        String startdate3 = "";
        String enddate3 = "";
        String company3 = "";
        String workduty3 =  "";
        String salary3 = "";
        String people3 = "";
        String telphone3 = "";
        String reason3 = "";
        if (experience3!=null && experience3.length>0){
            startdate3 = experience1[0];
            enddate3 = experience1[1];
            company3 = experience1[2];
            workduty3 = experience1[3];
            salary3 = experience1[4];
            people2 = experience1[5];
            telphone2 = experience1[6];
            reason2 = experience1[7];
        }
        data.put("startdate3",startdate3);
        data.put("enddate3",enddate3);
        data.put("company3",company3);
        data.put("workduty3",workduty3);
        data.put("salary3",salary3);
        data.put("people3",people3);
        data.put("telphone3",telphone3);
        data.put("reason3",reason3);*/


        String startdate2 = "";
        String enddate2 = "";
        String company2 = "";
        String workduty2 =  "";
        String salary2 = "";
        String people2 = "";
        String telphone2 = "";
        String reason2= "";
        String startdate3 = "";
        String enddate3 = "";
        String company3 = "";
        String workduty3 =  "";
        String salary3 = "";
        String people3 = "";
        String telphone3 = "";
        String reason3 = "";
        String startdate4 = "";
        String enddate4 = "";
        String lastcompany = "";
        String workduty4 =  "";
        String salary4 = "";
        String people4 = "";
        String telphone4 = "";
        String reason4 = "";

        String[] experience = request.getParameterValues("moreexperience");
        if (experience!=null && experience.length>0) {
            for (int i = 0; i < experience.length; i++) {
                if (experience.length>0&&experience.length<=8){
                    startdate2 = experience[0];
                    enddate2 = experience[1];
                    company2 = experience[2];
                    workduty2 = experience[3];
                    salary2 = experience[4];
                    people2 = experience[5];
                    telphone2 = experience[6];
                    reason2 = experience[7];
                    data.put("startdate2",startdate2);
                    data.put("enddate2",enddate2);
                    data.put("company2",company2);
                    data.put("workduty2",workduty2);
                    data.put("salary2",salary2);
                    data.put("people2",people2);
                    data.put("telphone2",telphone2);
                    data.put("reason2",reason2);
                }
                if (experience.length>8&&experience.length<=16){
                    startdate2 = experience[0];
                    enddate2 = experience[1];
                    company2 = experience[2];
                    workduty2 = experience[3];
                    salary2 = experience[4];
                    people2 = experience[5];
                    telphone2 = experience[6];
                    reason2 = experience[7];
                    data.put("startdate2",startdate2);
                    data.put("enddate2",enddate2);
                    data.put("company2",company2);
                    data.put("workduty2",workduty2);
                    data.put("salary2",salary2);
                    data.put("people2",people2);
                    data.put("telphone2",telphone2);
                    data.put("reason2",reason2);
                    startdate3 = experience[8];
                    enddate3 = experience[9];
                    company3 = experience[10];
                    workduty3 = experience[11];
                    salary3 = experience[12];
                    people3 = experience[13];
                    telphone3 = experience[14];
                    reason3 = experience[15];
                    data.put("startdate3",startdate3);
                    data.put("enddate3",enddate3);
                    data.put("company3",company3);
                    data.put("workduty3",workduty3);
                    data.put("salary3",salary3);
                    data.put("people3",people3);
                    data.put("telphone3",telphone3);
                    data.put("reason3",reason3);
                }
                if (experience.length>16){
                    startdate2 = experience[0];
                    enddate2 = experience[1];
                    company2 = experience[2];
                    workduty2 = experience[3];
                    salary2 = experience[4];
                    people2 = experience[5];
                    telphone2 = experience[6];
                    reason2 = experience[7];
                    data.put("startdate2",startdate2);
                    data.put("enddate2",enddate2);
                    data.put("company2",company2);
                    data.put("workduty2",workduty2);
                    data.put("salary2",salary2);
                    data.put("people2",people2);
                    data.put("telphone2",telphone2);
                    data.put("reason2",reason2);
                    startdate3 = experience[8];
                    enddate3 = experience[9];
                    company3 = experience[10];
                    workduty3 = experience[11];
                    salary3 = experience[12];
                    people3 = experience[13];
                    telphone3 = experience[14];
                    reason3 = experience[15];
                    data.put("startdate3",startdate3);
                    data.put("enddate3",enddate3);
                    data.put("company3",company3);
                    data.put("workduty3",workduty3);
                    data.put("salary3",salary3);
                    data.put("people3",people3);
                    data.put("telphone3",telphone3);
                    data.put("reason3",reason3);
                    startdate4 = experience[16];
                    enddate4 = experience[17];
                    lastcompany = experience[18];
                    workduty4 = experience[19];
                    salary4 = experience[20];
                    people4 = experience[21];
                    telphone4 = experience[22];
                    reason4 = experience[23];
                    data.put("startdate4",startdate4);
                    data.put("enddate4",enddate4);
                    data.put("lastcompany",lastcompany);
                    data.put("workduty4",workduty4);
                    data.put("salary4",salary4);
                    data.put("people4",people4);
                    data.put("telphone4",telphone4);
                    data.put("reason4",reason4);
                }

            }
        }

        /*结束 工作经历*/
        /*处理紧急联系人*/
        String sosName = request.getParameter("sosName").trim();
        String sosRealtion = request.getParameter("sosRelation").trim();
        String sosAddress = request.getParameter("sosAddress").trim();
        String sosPhone = request.getParameter("sosPhone").trim();
        data.put("name1",sosName);
        data.put("relation",sosRealtion);
        data.put("address1",sosAddress);
        data.put("phone1",sosPhone);
        /*结束*/
        System.out.println(data);

        return data;
    }

    //保存员工
    //@Override
    /*public Map<String, String> saveWorks(HttpServletRequest request) {
        Map<String,String> data = new HashMap<>();
        String iname0 = request.getParameter("iname").trim();
        data.put("iname0",iname0);
        data.put("iname1",iname0);
        String phone0 = request.getParameter("phone0").trim();
        data.put("iphone0",phone0);
        data.put("iphone1",phone0);
        String post0 = request.getParameter("post").trim();
        data.put("post0",post0);
        String sex = request.getParameter("sex").trim();
        data.put("sex",sex);
        //出生日期
        String borndate = request.getParameter("date2").trim();
        data.put("borndate",borndate);
        String nativePlace = request.getParameter("nativePlace").trim();
        data.put("nativePlace",nativePlace);
        String nation = request.getParameter("nation").trim();
        data.put("nation",nation);
        String hasFaith = request.getParameter("hasFaith");
        String f_1= "□";
        String f_2= "□";
        String faith = "";
        if ("0".equals(hasFaith)){  //没有宗教信仰
            f_1 = "√";
        }else{
            f_2 = "√";
            faith = request.getParameter("faith");
        }
        data.put("f_1",f_1);
        data.put("f_2",f_2);
        if (faith==null||faith==""){
            data.put("faith","______");
        }else{
            data.put("faith",faith.trim());
        }


        String education = request.getParameter("education");
        if (!StringUtils.isEmpty(education)){
            education = education.trim();
        }else{
            education =  "";
        }
        data.put("education0",education);
        String marr1 = "□";
        String marr2 = "□";
        if ("1".equals(request.getParameter("marriage"))){
            marr1 = "√";
        }else{
            marr2 = "√";
        }
        data.put("marr1",marr1);
        data.put("marr2",marr2);
        String idcard = request.getParameter("idcard").trim();
        data.put("idcard",idcard);
        String idAddress = request.getParameter("idAddress").trim();
        data.put("idAddress",idAddress);
        String address = request.getParameter("address").trim();
        data.put("address",address);
        String[] family1 = request.getParameterValues("family1");
        String member1 = family1[0];
        String relation1 = family1[1];
        String phone1 = family1[2];
        String company1 = family1[3];
        data.put("member1",member1);
        data.put("relation1",relation1);
        data.put("phone1",phone1);
        data.put("company1",company1);
        String[] family2 = request.getParameterValues("family2");
        String member2 = "";
        String relation2 = "";
        String phone2 = "";
        String company2 = "";
        if (family2!=null && family2.length>0){
            member2 = family2[0];
            relation2 = family2[1];
            phone2 = family2[2];
            company2 = family2[3];
        }
        data.put("member2",member2);
        data.put("relation2",relation2);
        data.put("phone2",phone2);
        data.put("company2",company2);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//接收格式
        SimpleDateFormat value = new SimpleDateFormat("yyyy/MM");//设置格式
        *//*开始处理教育经历*//*
        String date1 = "";
        String school1 = request.getParameter("school1");
        if(school1!=null && school1!=""){
            data.put("school1",school1.trim());
        }else{
            data.put("school1","");
        }
        String scdate11 = request.getParameter("scdate11");
        if(scdate11!=null && scdate11!=""){
            try {
                date1  = value.format(sdf.parse(scdate11));
                String scdate12 = request.getParameter("scdate12");
                date1 = date1 +"-" + value.format(sdf.parse(scdate12));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date1",date1);
        String major1 = request.getParameter("major1");
        if(major1!=null && major1!=""){
            data.put("major1",major1.trim());
        }else{
            data.put("major1","");
        }
        String education1 = request.getParameter("education1");
        if(education1!=null && education1!=""){
            data.put("education1",education1.trim());
        }else{
            data.put("education1","");
        }

        String school2 = request.getParameter("school2");
        if(school2!=null && school2!=""){
            data.put("school2",school2.trim());
        }else{
            data.put("school2","");
        }
        String scdate21 = request.getParameter("scdate21");
        String date2 = "";
        if(scdate21!=null && scdate21!=""){
            try {
                date2  = value.format(sdf.parse(scdate21));
                String scdate22 = request.getParameter("scdate22");
                date2 = date2 +"-" + value.format(sdf.parse(scdate22));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        data.put("date2",date2);
        String major2 = request.getParameter("major2");
        if(major2!=null && major2!=""){
            data.put("major2",major2.trim());
        }else{
            data.put("major2","");
        }
        String education2 = request.getParameter("education2");
        if(education2!=null && education2!=""){
            data.put("education2",education2.trim());
        }else{
            data.put("education2","");
        }

        *//*结束 教育经历*//*



        *//*开始 工作经历*//*
        String[] experience1 = request.getParameterValues("experience1");
        String company3 = "";
        String post1 =  "";
        String date3 = "";
        String reason1 = "";
        if (experience1!=null && experience1.length>0){
            company3 = experience1[0];
            post1 = experience1[1];
            date3 = experience1[2];
            reason1 = experience1[3];
        }
        data.put("company3",company3);
        data.put("post1",post1);
        data.put("date3",date3);
        data.put("reason1",reason1);

        String[] experience2 = request.getParameterValues("experience2");
        String company4 = "";
        String post2 =  "";
        String date4 =  "";
        String reason2 = "";
        if (experience2!=null && experience2.length>0){
            company4 = experience2[0];
            post2 = experience2[1];
            date4 = experience2[2];
            reason2 = experience2[3];
        }
        data.put("company4",company4);
        data.put("post2",post2);
        data.put("date4",date4);
        data.put("reason2",reason2);

        String s_1 = "□";
        String s_2 = "□";
        String s_3 = "□";
        String s_4 = "□";
        String s_5 = "□";
        String s_6 = "□";
        String otherSkill = "______";
        if (!StringUtils.isEmpty(request.getParameter("mix"))){
            s_1 = "√";
        }
        if (!StringUtils.isEmpty(request.getParameter("coat"))){
            s_2 = "√";
        }
        if (!StringUtils.isEmpty(request.getParameter("Strip"))){
            s_3 = "√";
        }
        if (!StringUtils.isEmpty(request.getParameter("zhiPian"))){
            s_4 = "√";
        }
        if (!StringUtils.isEmpty(request.getParameter("wind"))){
            s_5 = "√";
        }
        if (!StringUtils.isEmpty(request.getParameter("test"))){
            s_6 = "√";
        }
        if(!StringUtils.isEmpty(request.getParameter("otherSkill"))){
            otherSkill = request.getParameter("otherSkill");
        }
        data.put("s_1",s_1);
        data.put("s_2",s_2);
        data.put("s_3",s_3);
        data.put("s_4",s_4);
        data.put("s_5",s_5);
        data.put("s_6",s_6);
        data.put("otherSkill",otherSkill);

        *//*结束 工作经历*//*
        *//*处理紧急联系人*//*
        String sosName = request.getParameter("sosName").trim();
        String sosPhone = request.getParameter("sosPhone").trim();
        String sosRela = request.getParameter("sosRelation");
        if (StringUtils.isEmpty(sosRela)){
            sosRela = "";
        }
        String sosLocation = request.getParameter("sosLocation");
        if (StringUtils.isEmpty(sosLocation)){
            sosLocation = "";
        }
        data.put("sosName",sosName);
        data.put("sosRela",sosRela);
        data.put("sosPhone",sosPhone);
        data.put("sosLocation",sosLocation);
        *//*结束*//*
        *//*应聘来源*//*
        String o_1 = "□";
        String o_2 = "□";
        String o_3 = "□";
        String o_4 = "□";
        String o_5 = "□";
        //外部/网络
        String origin1 = "______";
        String origin2 = "______";
        String origin3 = "______";
        if (!StringUtils.isEmpty(request.getParameter("internetValue"))){
            o_1 = "√";
            origin1 = request.getParameter("internetValue");
        }
        if (!StringUtils.isEmpty(request.getParameter("jobCentre"))){
            o_2 = "√";
            origin2 = request.getParameter("jobCentre");
        }
        if (!StringUtils.isEmpty(request.getParameter("jobSchool"))){
            o_3 = "√";
            origin3 = request.getParameter("jobSchool");
        }
        data.put("o_1",o_1);
        data.put("o_2",o_2);
        data.put("o_3",o_3);
        data.put("origin1",origin1);
        data.put("origin2",origin2);
        data.put("origin3",origin3);
        //内部推荐
        String oriName1 = "______";
        String oriRela1 = "______";
        String oriId1 = "______";
        if (!StringUtils.isEmpty(request.getParameter("oriName1"))){
            o_4 = "√";
            oriName1 = request.getParameter("oriName1");
            if (!StringUtils.isEmpty(request.getParameter("oriRela1"))){
                oriRela1 = request.getParameter("oriRela1");
            }
            if (!StringUtils.isEmpty(request.getParameter("oriId1"))){
                oriId1 = request.getParameter("oriId1");
            }
        }
        data.put("o_4",o_4);
        data.put("oriName1",oriName1);
        data.put("oriRela1",oriRela1);
        data.put("oriId1",oriId1);
        //外部推荐
        String oriName2 = "________";
        String oriRela2 = "________";
        String oriPhone2 = "________";
        if (!StringUtils.isEmpty(request.getParameter("oriName2"))){
            o_5 = "√";
            oriName2 = request.getParameter("oriName2");
            if (!StringUtils.isEmpty(request.getParameter("oriRela2"))){
                oriRela2 = request.getParameter("oriRela2");
            }
            if (!StringUtils.isEmpty(request.getParameter("oriPhone2"))){
                oriPhone2 = request.getParameter("oriPhone2");
            }
        }
        data.put("o_5",o_5);
        data.put("oriName2",oriName2);
        data.put("oriRela2",oriRela2);
        data.put("oriPhone2",oriPhone2);
        *//*结束 应聘来源*//*


        System.out.println(data);

        return data;
    }*/
}
