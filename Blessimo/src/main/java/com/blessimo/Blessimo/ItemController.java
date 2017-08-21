package com.blessimo.Blessimo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ItemController 
{
	
	@Autowired
	ItemRepository repository;
	
	
	@RequestMapping(value = "/postitem", method = RequestMethod.POST)
	public void postItem(@RequestBody Item item) {
	// Item(String itemName,String itemDescription, String itemLine, String pathToItemImage, long itemSize,long itemPrice)
		repository.save(new Item(item.getItemName(), item.getItemDescription(),item.getItemLine(),item.getPathToImage(),item.getItemSize(), item.getItemPrice()));	
	
	}

	@RequestMapping("/findall")
	public Response findAll() {

		Iterable<Item> items = repository.findAll();

		return new Response("Done", items);
	}
	
	@RequestMapping("/findbyname")
	public Response findByName(@RequestParam("name") String name)
	{

		List<Item> items = repository.findByName(name);

		return new Response("Done", items);
	}
	@RequestMapping("/item/{id}")
	public Response findItemById(@PathVariable("id") long id) {

		Item item = repository.findOne(id);

		return new Response("Done", item);
	}
	
	

}
