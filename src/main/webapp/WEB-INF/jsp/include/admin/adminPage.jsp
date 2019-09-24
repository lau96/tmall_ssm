<!-- 模仿天猫整站ssm 教程 为how2j.cn 版权所有-->
<!-- 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关-->
<!-- 供购买者学习，请勿私自传播，否则自行承担相关法律责任-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>


<script>
	$(function() {
		$("ul.pagination li.disabled a").click(function() {
			return false;
		});
	});
</script>


<nav>
	<ul class="pagination">
		<li <c:if test='${page==1 }'>class="disabled"</c:if>>
			<a href="?<c:if test='${page!=1 }'>page=1</c:if>"
			aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
		</a></li>

		<li <c:if test='${page==1 }'>class="disabled"</c:if>>
			<a href="?<c:if test='${page!=1 }'>page=${page-1 }</c:if>" aria-label="Previous">
			<span aria-hidden="true">&lsaquo;</span>
		</a></li>

		<c:forEach begin="1" end="${totalPage}" var="status">
			<li <c:if test='${status==page }'>class="disabled"</c:if>>
				<a href="?<c:if test='${status!=page }'>page=${status }</c:if>"
				<c:if test="${status==page }">class="current"</c:if>>${status}</a>
			</li>

		</c:forEach>

		<li <c:if test='${totalPage==page }'>class="disabled"</c:if>>
			<a href="?<c:if test='${totalPage!=page }'>page=${page+1 }</c:if>" aria-label="Next">
				<span aria-hidden="true">&rsaquo;</span>
		</a></li>
		<li <c:if test='${totalPage==page }'>class="disabled"</c:if>>
			<a href="?<c:if test='${totalPage!=page }'>page=${totalPage }</c:if>" aria-label="Next">
			<span aria-hidden="true">&raquo;</span>
		</a></li>
	</ul>
</nav>
