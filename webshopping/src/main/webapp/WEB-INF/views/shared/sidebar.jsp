<p class="my-4">Shop Name</p>
<div class="list-group">
	<c:forEach var="category" items="${categories}">
		<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item">${category.name}</a>
	</c:forEach>
</div>