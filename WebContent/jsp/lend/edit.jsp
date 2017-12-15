<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>修改借阅记录</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css rel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		//利用ajax发请求 客户级别
		var url = "${pageContext.request.contextPath}/dict_findByCode.action";
		var param = {"dict_type_code":"006"};
		$.post(url,param,function(data){
			//i 索引 n对象
			$(data).each(function(i,n){
			/* 	alert(i+" : "+n.dict_item_name);  */
				//jq的DOM操作
				//先获取值栈中的值
				var vsId = "${model.level.dict_id}";
				if(vsId == n.dict_id){
				$("#levelId").append("<option value='"+n.dict_id+"' selected>"+n.dict_item_name+"</option>");
				}else{
				$("#levelId").append("<option value='"+n.dict_id+"'>"+n.dict_item_name+"</option>");
				}
			});
		},"json");
		//客户来源
		var param = {"dict_type_code":"002"};
		$.post(url,param,function(data){
			//i 索引 n对象
			$(data).each(function(i,n){
				/* alert(i+" : "+n.dict_item_name); */
				//jq的DOM操作
				//获取值栈中的值
				var vsId = "${model.source.dict_id}";
				if(vsId == n.dict_id){
				$("#sourceId").append("<option value='"+n.dict_id+"' selected>"+n.dict_item_name+"</option>");
				}else{
				$("#sourceId").append("<option value='"+n.dict_id+"'>"+n.dict_item_name+"</option>");
				}
			});
		},"json");
	});
</script>
<!-- 日期插件，使用jquery -->
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery-1.4.2.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/jquery/jquery.datepick.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery.datepick.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/jquery/jquery.datepick-zh-CN.js"></script>

<script type="text/javascript">
	$(function(){
		//使用class属性处理  'yy-mm-dd' 设置格式"yyyy/mm/dd"
		$('#timeId').datepick({dateFormat: 'yy-mm-dd'}); 
		$('#nextTimeId').datepick({dateFormat: 'yy-mm-dd'}); 
	});
</script>
<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<FORM id=form1 name=form1 action="${pageContext.request.contextPath }/lend_update.action"
		method="post" enctype="multipart/form-data"> 
		<!-- 隐藏借阅记录主键 -->
		<input type="hidden" name="lid" value="${model.lid }"/>

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg" border=0></TD>
					<TD width="100%" background=${pageContext.request.contextPath }/images/new_020.jpg  height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：借阅记录管理 &gt; 修改借阅记录</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE cellSpacing=0 cellPadding=5  border=0>
							<TR>
								<td>学&nbsp;&nbsp;&nbsp;&nbsp;号 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="reader.sid">
								</td>
							</TR>
							<TR>
								<td>图书编号 ：</td>
								<td>
								<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="book.bid">
								</td>
							</TR>
							<TR>
								<td>借书时间 ：</td>
								<td>
								<!-- <INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="lend_time"> -->
								<INPUT class=textbox id="nextTimeId" style="WIDTH: 180px" maxLength=50 name="lend_time">
								</td>
							</TR>
							<TR>
								<td>还书时间 ：</td>
								<td>
								<!-- <INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="return_time"> -->
								<INPUT class=textbox id="nextTimeId" style="WIDTH: 180px" maxLength=50 name="return_time">
								</td>
							</TR>
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit value=" 保存 " name=sButton2>
								</td>
							</tr>
						</TABLE>
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg" border=0></TD>
					<TD align=middle width="100%" background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	</FORM>
</BODY>
</HTML>
