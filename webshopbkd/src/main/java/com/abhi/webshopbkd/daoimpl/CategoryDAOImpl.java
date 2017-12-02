package com.abhi.webshopbkd.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.abhi.webshopbkd.dao.CategoryDAO;
import com.abhi.webshopbkd.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();
		
		// 1st Category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Description for Tele from id 1");
		category.setImageURL("cat1.png");

		categories.add(category);

		// 2nd Category
		category = new Category();
		category.setId(2);
		category.setName("Phone");
		category.setDescription("Description for phone from id 2");
		category.setImageURL("cat2.png");

		categories.add(category);

		// 3rd Category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Description for Laptop from id 3");
		category.setImageURL("cat3.png");

		categories.add(category);
		
		// 4th Category
				category = new Category();
				category.setId(4);
				category.setName("TouchPad");
				category.setDescription("Description for TouchPad from id 4");
				category.setImageURL("cat4.png");

				categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub

		return categories;
	}

	@Override
	public Category get(int id) {
		// Enhanced for loop for each category
		
		for(Category category : categories) {
			if(category.getId()==id) return category; 
		}
		
		return null;
	}

}