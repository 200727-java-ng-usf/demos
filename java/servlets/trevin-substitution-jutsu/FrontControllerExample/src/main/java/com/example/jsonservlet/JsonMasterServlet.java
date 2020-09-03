package com.example.jsonservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servlet.RequestHelper;

/*
 * JSON means JavaScript Object Notation
 * -a JSON is a data format used to transfer data in a platform independant way
 * -a JSON consists of key-value pairs (when it is an object)
 * 		>an array IS a valid JSON so the "key-value pair" comment may not make as much sense in
 * 			this case
 * 
 * JSON =/= JavaScript Object
 * 
 * (background: in JS 	{} is an object
 * 						[] is an array
 * 						"" is a string
 * )
 * 
 * examples of JSONs
 * {
 * 	"child1": 
 * 			{
 * 				"grandchild1": 35,
 * 				"grandchild2": "barnacles",
 * 				"grandchild3": "hello"
 * 			},
 * 	"child2": 50
 * }
 * ANOTHER example of a JSON
 * [ 35, "barnacles", {"grandchild2": 77}]
 * 		BASICALLY, an array is a valid JSON
 * 
 * example of XML
 * <xml>
 * 	<child1>
 * 		<grandchild1> 35</grandchild1>
 * 		<grandchild2> barnacles</grandchild2>
 * 		<grandchild3> hello</grandchild3>
 * 	</child1>
 * 	<child2> 50 </child2>
 * </xml>
 */
public class JsonMasterServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JsonRequestHelper.process(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JsonRequestHelper.process(request, response);
	}
	
}
