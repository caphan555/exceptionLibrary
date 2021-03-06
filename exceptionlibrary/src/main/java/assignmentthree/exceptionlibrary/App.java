package assignmentthree.exceptionlibrary;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import assignmentthree.exceptionlibrary.exception.EmptyInputException;
import assignmentthree.exceptionlibrary.exception.ExceptionDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ModuleDoesNotExistException;
import assignmentthree.exceptionlibrary.exception.ProjectDoesNotExistException;
import assignmentthree.exceptionlibrary.pojo.Action;
import assignmentthree.exceptionlibrary.pojo.Module;
import assignmentthree.exceptionlibrary.pojo.PossibleException;
import assignmentthree.exceptionlibrary.pojo.Project;
import assignmentthree.exceptionlibrary.service.ILibraryService;
import assignmentthree.exceptionlibrary.service.LibraryService;

/**
 * Hello world!
 *
 */
public class App 
{
	
   
    
    public ILibraryService setupLibrary() {
    	List<Project> projects = setUp();
    	return new LibraryService(projects);
    }
    
    public List<Action> provideSolutions(ILibraryService ls, String project, String module, String exception) throws EmptyInputException, ProjectDoesNotExistException, ModuleDoesNotExistException, ExceptionDoesNotExistException{
    	 
    	
    	return ls.provideSuggestedActions(project, module, exception);
    }
    
    public List<String> recommendActions(ILibraryService ls, List<Action> actions) {
    	return ls.handleAction(actions);
    }
    
    public static List<Project> setUp() {
    	try {	
    		List<Project> projects = new ArrayList<>();
            File inputFile = new File("exceptionlibrary.xml");
            DocumentBuilderFactory dbFactory 
               = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
           
            NodeList nList = doc.getElementsByTagName("project");
            for (int temp = 0; temp < nList.getLength(); temp++) {
               Node nNode = nList.item(temp);
               Element nElement = (Element)nNode;
               
               String projectName = nElement.getAttribute("name");
             
               
               List<Module> modules = new ArrayList<>();
               Project newProject = new Project(projectName, modules);
               
               NodeList mList = nElement.getElementsByTagName("module");
               for(int temp2 = 0; temp2 < mList.getLength(); temp2++) {
            	   Node mNode = mList.item(temp2);
            	   if (mNode.getNodeType() == Node.ELEMENT_NODE) {
                       Element mElement = (Element) mNode;
                       
                       String moduleName = mElement.getAttribute("name");
                 
                       List<PossibleException> exceptions = new ArrayList<>();
                       Module newModule = new Module(moduleName, exceptions);
                       
                       NodeList eList = mElement.getElementsByTagName("exception");
                       for(int temp3 = 0; temp3<eList.getLength(); temp3++) {
                    	   Node eNode = eList.item(temp3);
                    	   if(eNode.getNodeType() == Node.ELEMENT_NODE) {
                    		   Element eElement = (Element) eNode;
                    		   
                    		   String exceptionName = eElement.getAttribute("type");
                    		 
                    		   List<Action> actions = new ArrayList<>();
                    		   PossibleException newPossibleException = new PossibleException(exceptionName, actions);
                    		   
                    		   NodeList aList = eElement.getElementsByTagName("action");
                    		   Node aNode = aList.item(0);
                    		   NodeList children = aNode.getChildNodes();
                    		   for(int k=0; k<children.getLength();++k) {
                    			   if(children.item(k).getNodeType() == Node.ELEMENT_NODE) {
                    				   Element retrieval = (Element) children.item(k);
                    				   NamedNodeMap retrievalAttr = retrieval.getAttributes();
                    				   
                    				   String actionDescription = retrieval.getTagName();
                    				   actionDescription += " ";
                    				   for(int i=0; i<retrievalAttr.getLength(); i++) {
                    					   Node act = retrievalAttr.item(i);
                    					   actionDescription += act.getNodeName();
                    					   actionDescription += " ";
                    					   actionDescription += act.getNodeValue();
                    					   actionDescription += " ";
                    					   
                    					  
                    					   
                    				   }
                    				   Action newAction = new Action("", actionDescription);
                					   newPossibleException.getActions().add(newAction);
                    			   }
                    			   
                    		   }
                    		   newModule.getExceptions().add(newPossibleException);
                    	   }
                    	   
                       }
                       newProject.getModules().add(newModule);
            	   }
            	   
               }
               projects.add(newProject);
              
            }
          
           
            return projects;
         } catch (Exception e) {
            e.printStackTrace();
         }
		return new ArrayList<>();
    }
}
