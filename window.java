 import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//import javafx.scene.layout.Region;
public class window extends Application {

	
	int flag1=0;
	int flag2=0;
	float sale=0;
	/**
	 * This function creates a stage to take username and password of Super User.
	 * 
	 * @param s
	 */
	void funcSuperUser(Stage s)
	{
		Stage wnd1=new Stage();
		wnd1.sizeToScene(); 
	    wnd1.setTitle("Super User");
	    
	    Label label1 = new Label("UserName:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    //String u=textField1.getText();
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
	    Label label2 = new Label("Password:");
	    TextField textField2 = new TextField ();
	    //String p=textField2.getText();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    
	    //System.out.println(u+" "+p);
	    VBox vbox=new VBox();
	    vbox.setAlignment(Pos.CENTER);
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(8);
		Text title = new Text("LOGIN DETAILS");

		title.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(title);
		Button SubButton=new Button("SUBMIT");
		Button BackButton=new Button("BACK");
		BackButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				//Stage s=new Stage();
				wnd1.close();
				try {
					start(s);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		vbox.getChildren().addAll(hb1,hb2,SubButton,BackButton);
		Scene scene=new Scene(vbox);
		
		//submitbut1Handle handle1=new submitbut1Handle(wnd1);
		SubButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				submitHandle1(wnd1,textField1,textField2,s);
			}
			
		});
		
		wnd1.setScene(scene);
		wnd1.show();
	    //return wnd1;

	}
	
	/////////////////////////////////////////////////////////////////
	
	/**
	 * This function creates a stage to take username and password of Store Administrator.
	 * 
	 * @param s
	 */
	void funcStoreAdmin(Stage s)
	{
		Stage wnd2=new Stage();
	    wnd2.setTitle("Store Administrator");
	    wnd2.sizeToScene(); 
	    Label label1 = new Label("UserName:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    Label label2 = new Label("Password:");
	    TextField textField2 = new TextField ();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    VBox vbox=new VBox();
	    vbox.setAlignment(Pos.CENTER);
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(8);
		Text title = new Text("LOGIN");
		title.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(title);
		Button SubButton=new Button("SUBMIT");
		
		Button BackButton=new Button("BACK");
		BackButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				//Stage s=new Stage();
				wnd2.close();
				try {
					start(s);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		vbox.getChildren().addAll(hb1,hb2,SubButton,BackButton);
		Scene scene=new Scene(vbox);
		wnd2.setScene(scene);
		//submitbut2Handle handle1=new submitbut2Handle(wnd2,textField1,textField2,vbox);
		SubButton.setOnAction(new EventHandler<ActionEvent>() {
			
		

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				submitHandle2(wnd2,textField1,textField2,s);
			}});
	
	    wnd2.show();
		
	}
	
	///////////////////////////////////////////////////////////////////
	
	/**
	 * This function creates a stage to take username and password of warehouse Administrator.
	 * 
	 * @param s
	 */
	void funcWareAdmin(Stage s)
	{
		Stage wnd3=new Stage();
		wnd3.sizeToScene(); 
	    wnd3.setTitle("Warehouse Administrator");
	    
	    Label label1 = new Label("UserName:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    Label label2 = new Label("Password:");
	    TextField textField2 = new TextField ();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    VBox vbox=new VBox();
	    vbox.setAlignment(Pos.CENTER);
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(8);
		Text title = new Text("LOGIN");
		title.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(title);
		Button SubButton=new Button("SUBMIT");
		Button BackButton=new Button("BACK");
		BackButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				//Stage s=new Stage();
				wnd3.close();
				try {
					start(s);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		SubButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				submitHandle3(wnd3,textField1,textField2,s);
			}
			
		});
		vbox.getChildren().addAll(hb1,hb2,SubButton,BackButton);
		Scene scene=new Scene(vbox);
		wnd3.setScene(scene);
	    wnd3.show();
		
	}
	
	////////////////////////////////////////////////////////////////
	void funcEndUser1(Stage s)
	{
		//EndUser e=null;
		Stage popup=new Stage();
		
		Text t=new Text("Do you have membership");
	    t.setFont(Font.font("Arial", 15));
		ChoiceBox<String> yn=new ChoiceBox<String>();
		yn.setMaxWidth(500);
		yn.getItems().addAll("Yes","No");
		
		 yn.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> ov, Number value, Number new_) {
				if(new_.intValue()==0)
				{
					Label label1 = new Label("Enter Membership Id:");
				    TextField textField1 = new TextField ();
				    HBox hb1 = new HBox();
				    hb1.getChildren().addAll(label1, textField1);
				    hb1.setSpacing(10);
				    hb1.setAlignment(Pos.CENTER);
				    
				    Button ok=new Button("OK");
					ok.setOnAction(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							EndUser e = null;
							for(int i=0;i<Project.s.AllCustomers.size();i++)
							{
								if(Project.s.AllCustomers.get(i).membership_id==Integer.parseInt(textField1.getText()))
								{
									e=(Project.s.AllCustomers.get(i));
								}
							}
							if(e==null)
							{
								popup.close();
								try {
									start(s);
								} catch (Exception ep) {
									// TODO Auto-generated catch block
									ep.printStackTrace();
								}
							}
							else
							{
								popup.close();
								funcEndUser(s,e);
							}
							
						}
						
					});
					VBox vbox=new VBox();
					vbox.setAlignment(Pos.CENTER);
				    vbox.setPadding(new Insets(10));
				    vbox.setSpacing(8);
				    vbox.setMaxWidth(Double.MAX_VALUE);
				    vbox.getChildren().addAll(hb1,ok);
				    popup.setScene(new Scene(vbox));
				    popup.show();
				   
				    
				}
				else
				{
					Text t=new Text("Want to have membership");
				    t.setFont(Font.font("Arial", 15));
					ChoiceBox<String> yn=new ChoiceBox<String>();
					yn.setMaxWidth(500);
					yn.getItems().addAll("Yes","No");
					VBox vbox=new VBox();
					vbox.setAlignment(Pos.CENTER);
				    vbox.setPadding(new Insets(10));
				    vbox.setSpacing(8);
				    vbox.setMaxWidth(Double.MAX_VALUE);
				    vbox.getChildren().addAll(t,yn);
					yn.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

						@Override
						public void changed(ObservableValue<? extends Number> ov, Number value, Number new_) {
							if(new_.intValue()==0)
							{
								EndUser e=new EndUser();
								e.membership_id=e.give_id();
								Project.s.AllCustomers.add(e);
								String  str="New Membership id : "+Integer.toString(e.membership_id);
								Text t1=new Text(str);
								VBox vbox=new VBox();
								vbox.setAlignment(Pos.CENTER);
							    vbox.setPadding(new Insets(10));
							    vbox.setSpacing(8);
							    vbox.setMaxWidth(Double.MAX_VALUE);
								vbox.getChildren().add(t1);
								popup.setScene(new Scene(vbox));
								popup.show();
								long mtime=System.currentTimeMillis();
								long time=mtime+1000;
								while(System.currentTimeMillis()<time)
								{
									
								}
								popup.close();
								funcEndUser(s,e);
								
							}
							else
							{
								EndUser e=new EndUser();
								popup.close();
								funcEndUser(s,e);
							}
						}
					});
					
					
					
				    popup.setScene(new Scene(vbox));
				    popup.show();
				}
				}
		 });
		 
		    Button BackButton=new Button("Back");
			BackButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					popup.close();
				}
				
			});
			
			VBox vbox=new VBox();
			vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(8);
		    vbox.setMaxWidth(Double.MAX_VALUE);
		    vbox.getChildren().addAll(t,yn,BackButton);
		    popup.setScene(new Scene(vbox));
		    popup.show();
		
	}
	
	/**
	 * This function allows the end user to see all the categories,Sub-categories and items available in various stores.
	 * 
	 * @param s
	 */
	void funcEndUser(Stage s,EndUser e)
	{
		
		
		Stage wnd4=new Stage();
	    wnd4.setTitle("End User");
	    wnd4.sizeToScene(); 
	    Text t=new Text("SELECT STORE");
	    t.setFont(Font.font("Arial", FontWeight.BOLD, 25));
	    ChoiceBox<String> c=new ChoiceBox<String>();
	    c.setMaxWidth(500);
	    
	    Stage wnd5=new Stage();
	    Stage wnd6=new Stage();
	    Stage wnd7=new Stage();
	    
	    Button BackButton1=new Button("Back");
		BackButton1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				wnd5.close();
				wnd6.close();
				wnd7.close();
				
			    
			    
			}
			
		});
		
	    Button exit=new Button("Exit");
		exit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				wnd4.close();
				wnd5.close();
				wnd6.close();
				wnd7.close();
				
				Stage popup=new Stage();
				
				Text t=new Text("Total Cost of the purchase");
			    t.setFont(Font.font("Arial", 15));
			    
			    VBox vbox=new VBox();
			    String str="Bonus points :"+Integer.toString(e.bonus_point);
			    t.setFont(Font.font("Arial", 10));
			    Text t1=new Text(str);
			    vbox.getChildren().addAll(t,t1);
			    if(e.bonus_point>1000)
			    {
			    	Text t2=new Text("Discount of 10 percent applied");
			    	t.setFont(Font.font("Arial", 10));
			    	vbox.getChildren().add(t2);
			    }
			    sale=sale+e.purchase();
			    String str1="Total cost : "+Float.toString(e.purchase());
			    Text t4=new Text(str1);
			    
			    Button ok=new Button("OK");
				ok.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						popup.close();
					}
					
				});
			    
				vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(10));
			    vbox.setSpacing(8);
			    vbox.setMaxWidth(Double.MAX_VALUE);
			    vbox.getChildren().addAll(t4,ok);
			    popup.setScene(new Scene(vbox));
			    popup.show();
			}
			
		});
		

	    
//	    Label sortoption=new Label("Sorting options");
//	    ChoiceBox<String> sortChoice=new ChoiceBox<String>();
//	    sortChoice.setMaxWidth(400);
//	    sortChoice.getItems().addAll("Sort Alphabatecially","Sort by price","Sort by quantity");
//	    HBox hb1 = new HBox();
//	    hb1.getChildren().addAll(sortoption,sortChoice);
//	    hb1.setSpacing(10);
//	    hb1.setAlignment(Pos.CENTER);
//	    
//	    Label sortoption1=new Label("Sorting options");
//	    ChoiceBox<String> sortChoice1=new ChoiceBox<String>();
//	    sortChoice1.setMaxWidth(400);
//	    sortChoice1.getItems().addAll("Sort Alphabatecially","Sort by price","Sort by quantity");
//	    HBox hb2 = new HBox();
//	    hb2.getChildren().addAll(sortoption1,sortChoice1);
//	    hb2.setSpacing(10);
//	    hb2.setAlignment(Pos.CENTER);
	    
	    Label sortoption2=new Label("Sorting options");
	    ChoiceBox<String> sortChoice2=new ChoiceBox<String>();
	    sortChoice2.setMaxWidth(400);
	    sortChoice2.getItems().addAll("Sort By Item name","Sort by Cost","Sort by Category Name");
	    
	    Button apply=new Button("Apply");
	    
	    HBox hb3 = new HBox();
	    hb3.getChildren().addAll(sortoption2,sortChoice2,apply);
	    hb3.setSpacing(10);
	    hb3.setAlignment(Pos.CENTER);
	    
	    //ListView<String> listView = new ListView<String>();
	    System.out.println(Project.s.AllStores.size());
	    for(int i=0;i<Project.s.AllStores.size();i++)
	    {
	    	//listView.getItems().add(Project.s.AllStores.get(i).getName());
	    	String l=(Project.s.AllStores.get(i).getName());
	
	    	c.getItems().add(l);
	    }

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));
	    vbox.setSpacing(8);
        vbox.getChildren().add(t);
        if(!Project.s.AllStores.isEmpty())
        {
        	//System.out.println("empty");
        	vbox.getChildren().add(c);
        }
        else
        {
        	Text t1=new Text("No stores are currently available");
        	 t1.setFont(Font.font("Arial", FontWeight.MEDIUM, 20));
        	 vbox.getChildren().add(t1);
        }
        
    	Label l1=new Label();
        c.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> ov, Number value, Number new_) {
				// TODO Auto-generated method stub
			
				
			    wnd5.setTitle("Categories");
			    wnd5.sizeToScene(); 
			    
			    TextField textField1 = new TextField ();
			    HBox hbsearch = new HBox();
			    Button search=new Button("Search");
			    hbsearch.getChildren().addAll(textField1,search);
			    hbsearch.setSpacing(10);
			    hbsearch.setAlignment(Pos.CENTER);
			    
			    VBox vbox=new VBox();
			    Text t=new Text("SELECT CATEGORY");
			    t.setFont(Font.font("Arial", FontWeight.BOLD, 15));
				//l1.setText("selected");
			    vbox.setAlignment(Pos.CENTER);
		        vbox.setPadding(new Insets(10));
			    vbox.setSpacing(8);
		        vbox.getChildren().addAll(t,hbsearch);
		        
		        ListView<String> list=new ListView<String>();
				Inventory in=null;
				Store st=Project.s.AllStores.get(new_.intValue());
				in=Project.s.AllStores.get(new_.intValue()).getInventory();
				if(in!=null)
				{
					//System.out.println(in.AllCategories.size());
					for(int j=0;j<in.AllCategories.size();j++)
					{
						list.getItems().add(in.AllCategories.get(j).getName());
						//list.getItems().add("xyz");
					}
				}
				
				search.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						list.getItems().clear();
						for(int i=0;i<st.getInventory().AllCategories.size();i++)
						{
							int l=textField1.getText().length();
							if(st.getInventory().AllCategories.get(i).getName().substring(0, l).equals(textField1.getText()))
							{
								list.getItems().add(st.getInventory().AllCategories.get(i).getName());
							}
						}
					}
					
				});
				
				
				//System.out.println("s" + s);
				
				list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
				    @Override
				    public void changed(ObservableValue<? extends String> ov, String value, String ew_)  {
				    	
				        //System.out.println("ListView Selection Changed (newValue: " + newValue + ")\n");
				    	
					    wnd6.setTitle("Sub Categories");
					    wnd6.sizeToScene(); 
					    VBox vbox=new VBox();
					    Text t=new Text("SELECT SUB-CATEGORY");
					    t.setFont(Font.font("Arial", FontWeight.BOLD, 15));
						//l1.setText("selected");
					    vbox.setAlignment(Pos.CENTER);
				        vbox.setPadding(new Insets(10));
					    vbox.setSpacing(8);
				        vbox.getChildren().add(t);
				        
				        TextField textField1 = new TextField ();
					    HBox hbsearch = new HBox();
					    Button search=new Button("Search");
					    hbsearch.getChildren().addAll(textField1,search);
					    hbsearch.setSpacing(10);
					    hbsearch.setAlignment(Pos.CENTER);
				        

				        ListView<String> list=new ListView<String>();
						//Inventory in=null;
				        
						Category c = null;
						for(int a=0;a<st.getInventory().AllCategories.size();a++)
						{
							if(ew_.equals(st.getInventory().AllCategories.get(a).getName()))
							{
								c=st.getInventory().AllCategories.get(a);
							}
						}
						
						if(c!=null)
						{
							
							for(int j=0;j<c.ListOfSubcategories.size();j++)
							{
								list.getItems().add(c.ListOfSubcategories.get(j).getName());
								//list.getItems().add("xyz");
							}
						}
						
						search.setOnAction(new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent arg0) {
								// TODO Auto-generated method stub
								list.getItems().clear();
								Category c = null;
								for(int a=0;a<st.getInventory().AllCategories.size();a++)
								{
									if(ew_.equals(st.getInventory().AllCategories.get(a).getName()))
									{
										c=st.getInventory().AllCategories.get(a);
									}
								}
								for(int i=0;i<c.ListOfSubcategories.size();i++)
								{
									int l=textField1.getText().length();
									if(c.ListOfSubcategories.get(i).getName().substring(0, l).equals(textField1.getText()))
									{
										list.getItems().add(c.ListOfSubcategories.get(i).getName());
									}
								}
							}
							
						});
						
						list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
						    @Override
						    public void changed(ObservableValue<? extends String> ov, String value, String ne_)  {
						    	
						        //System.out.println("ListView Selection Changed (newValue: " + newValue + ")\n");
						    	
							    wnd7.setTitle("Items");
							    wnd7.sizeToScene(); 
							    VBox vbox=new VBox();
							    Text t=new Text("SELECT ITEM");
							    t.setFont(Font.font("Arial", FontWeight.BOLD, 15));
								//l1.setText("selected");
							    vbox.setAlignment(Pos.CENTER);
						        vbox.setPadding(new Insets(10));
							    vbox.setSpacing(8);
						        vbox.getChildren().add(t);
							
						        
						        ListView<String> list=new ListView<String>();
								//Inventory in=null;
						        //Category c=Project.s.AllStores.get(new_.intValue()).getInventory().AllCategories.get(new_.intValue());
						    	Category c = null;
								for(int a=0;a<st.getInventory().AllCategories.size();a++)
								{
									if(ew_.equals(st.getInventory().AllCategories.get(a).getName()))
									{
										c=st.getInventory().AllCategories.get(a);
									}
								}
								System.out.println(c.getName());
								Subcategory s = null;
								for(int a=0;a<c.ListOfSubcategories.size();a++)
								{
									if(ne_.equals(c.ListOfSubcategories.get(a).getName()))
									{
										s=c.ListOfSubcategories.get(a);
									}
								}
						      System.out.println(s.getName());
								if(s.ListOfItems!=null)
								{
									for (Map.Entry<Item,Integer> entry : st.getInventory().AllItems.entrySet())
									{
										if(entry.getKey().getSubcategory().equals(s))
										{
											list.getItems().add(entry.getKey().getName()+"   "+entry.getValue());
										}
									}
								}
								
								TextField textField1 = new TextField ();
							    HBox hbsearch = new HBox();
							    Button search=new Button("Search");
							    hbsearch.getChildren().addAll(textField1,search);
							    hbsearch.setSpacing(10);
							    hbsearch.setAlignment(Pos.CENTER);
								
								search.setOnAction(new EventHandler<ActionEvent>() {

									@Override
									public void handle(ActionEvent arg0) {
										// TODO Auto-generated method stub
										list.getItems().clear();
								    	Category c = null;
										for(int a=0;a<st.getInventory().AllCategories.size();a++)
										{
											if(ew_.equals(st.getInventory().AllCategories.get(a).getName()))
											{
												c=st.getInventory().AllCategories.get(a);
											}
										}
											
										Subcategory s = null;
										for(int a=0;a<c.ListOfSubcategories.size();a++)
										{
											if(ne_.equals(c.ListOfSubcategories.get(a).getName()))
											{
												s=c.ListOfSubcategories.get(a);
											}
										}
								      
										if(s.ListOfItems!=null)
										{
											int l=textField1.getText().length();
											for (Map.Entry<Item,Integer> entry : st.getInventory().AllItems.entrySet())
											{
												if(entry.getKey().getSubcategory().equals(s) && entry.getKey().getName().substring(0,l).equals(textField1.getText()))
												{
													list.getItems().add(entry.getKey().getName()+"   "+entry.getValue());
												}
											}
										}
									}
									
								});
								list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
								    @Override
								    public void changed(ObservableValue<? extends String> ov, String value, String new_)  {
								    int save=0;
								    for(int k=0;k<new_.length();k++)
								    {
								    	if(new_.charAt(k)==' ')
								    	{
								    		save=k;
								    		break;
								    	}
								    }
									Category c = null;
									for(int a=0;a<st.getInventory().AllCategories.size();a++)
									{
										if(ew_.equals(st.getInventory().AllCategories.get(a).getName()))
										{
											c=st.getInventory().AllCategories.get(a);
										}
									}
									Subcategory s = null;
									for(int a=0;a<c.ListOfSubcategories.size();a++)
									{
										if(ne_.equals(c.ListOfSubcategories.get(a).getName()))
										{
											s=c.ListOfSubcategories.get(a);
										}
									}
								    String Item_name=new_.substring(0, save);
								    Item it=null;
									for (Map.Entry<Item,Integer> entry : st.getInventory().AllItems.entrySet())
									{
										if(entry.getKey().getName().equals(Item_name))
										{
											it=entry.getKey();
										}
									}
								    func(st,s,it,e);
									
								    }
								});
							  
							    Button BackButton3=new Button("Back");
								BackButton3.setOnAction(new EventHandler<ActionEvent>() {

									@Override
									public void handle(ActionEvent arg0) {
										// TODO Auto-generated method stub
										wnd7.close();
									}
									
								});
								
								apply.setOnAction(new EventHandler<ActionEvent>() {
									
									@Override
									public void handle(ActionEvent arg0) {
										// TODO Auto-generated method stub
										System.out.println("apply handle");
										ObservableList<String> itlist=list.getItems();
										String val=(String)sortChoice2.getValue();
										ArrayList<Item> a=new ArrayList<Item>();
										System.out.println(itlist.size());
										for(int i=0;i<itlist.size();i++)
										{
											System.out.println("loop1");
											for (Map.Entry<Item,Integer> entry : st.getInventory().AllItems.entrySet())
											{
												//System.out.println("loop2");
												String str=entry.getKey().getName()+"   "+entry.getValue();
												if(str.equals(itlist.get(i)))
												{
													a.add(entry.getKey());
													System.out.println(entry.getKey().getName());
												}
											}
										}
										if(val.equals("Sort By Item name"))
										{
											System.out.println("option1");
											Collections.sort(a, new SortByName() );
										}
										else if(val.equals("Sort by Cost"))
										{
											System.out.println("option2");
											Collections.sort(a, new SortByCost());
										}
										else
										{
											System.out.println("option3");
											Collections.sort(a, new SortByCategory());
									
										}
										list.getItems().clear();
										System.out.println(a.size());
										for(int i=0;i<a.size();i++)
										{
											System.out.println(a.get(i).getName());
											for (Map.Entry<Item,Integer> entry : st.getInventory().AllItems.entrySet())
											{
												if(a.get(i).getName().equals(entry.getKey().getName()))
												{
													list.getItems().add(a.get(i).getName()+"   "+entry.getValue());
												}
											}
										}
											
										}
									
						    
									
								});
								
								vbox.getChildren().addAll(hbsearch,list,hb3,BackButton3,exit);
						        Scene sc=new Scene(vbox);
						        wnd7.setScene(sc);
								wnd7.show();
							
						    }
						    
						});
						
					    Button BackButton2=new Button("Back");
						BackButton2.setOnAction(new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent arg0) {
								// TODO Auto-generated method stub
								wnd6.close();
								wnd7.close();
							}
							
						});
						
						vbox.getChildren().addAll(hbsearch,list,BackButton2,exit);
				        Scene s=new Scene(vbox);
				        wnd6.setScene(s);
						wnd6.show();
					
				    }
				    
				});
		        
		        
		        vbox.getChildren().addAll(list,BackButton1,exit);
		        Scene s=new Scene(vbox);
		        wnd5.setScene(s);
				wnd5.show();
			}
        	
        });
        Button BackButton=new Button("BACK");
		BackButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				//Stage s=new Stage();
				wnd4.close();
				try {
					start(s);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
        vbox.getChildren().addAll(BackButton,l1,exit);
        Scene scene = new Scene(vbox);
        wnd4.setScene(scene);
	    wnd4.show();
		
	}
	
	///////////////////////////////////////////////////////////////////////////
		
	void func(Store st,Subcategory s,Item it,EndUser e)
	{
		Stage req=new Stage();
	    Label label1 = new Label("Enter Quantity:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);

	    
	    Button PO=new Button("Add to Cart");
	    PO.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			st.getInventory().UpdateQuantity(it, st.getInventory().AllItems.get(it)-Integer.parseInt(textField1.getText()));
			e.add_to_cart(it, Integer.parseInt(textField1.getText()));	
			
			req.close();
		}
		
	});
	    VBox vbox4=new VBox();
	    vbox4.getChildren().addAll(hb1,PO);
	    vbox4.setAlignment(Pos.CENTER);
	    vbox4.setPadding(new Insets(10));
	    vbox4.setSpacing(8);
	    vbox4.setMaxWidth(Double.MAX_VALUE);
        Scene scene = new Scene(vbox4);
        req.setScene(scene);
	    req.show();
	}
	
	///////////////////////////////////////////////////
	
	
	/**
	 * This function allows super user to select the operation he wants to perform.It also verfies whether the
	 * username and password added by the superuser is correct or not.
	 * 
	 * @param s1
	 * @param t1
	 * @param t2
	 * @param s3
	 */
	void submitHandle1(Stage s1,TextField t1,TextField t2,Stage s3)
	{
		int flag=0;
		if(t1.getText().equals(Project.Supuser.getId()))
		{
			flag=1;
			if(t2.getText().equals(Project.Supuser.getPassword()))
			{
				VBox vbox=new VBox();
				vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(10));
			    vbox.setSpacing(8);
			    vbox.setMaxWidth(Double.MAX_VALUE);
			    Text title1 = new Text();
			    title1.setText("OPTIONS");
				title1.setFont(Font.font("Arial", FontWeight.BOLD, 15));
				vbox.getChildren().add(title1);
			    Button b1=new Button("Create new Warehouse");
			    b1.setMaxWidth(500);
			    Button b2=new Button("Create new Store");
			    b2.setMaxWidth(500);
			    Button b3=new Button("View Warehouses");
			    b3.setMaxWidth(500);
			    Button b4=new Button("View stores");
			    b4.setMaxWidth(500);
			    Button b5=new Button("Link store to warehouse");
			    b5.setMaxWidth(500);
			    Button b6=new Button("Delete warehouse");
			    b6.setMaxWidth(500);
			    Button b7=new Button("Delete Store");
			    b7.setMaxWidth(500);
		        Button logout=new Button("LOGOUT");
				logout.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						//Stage s=new Stage();
						
//						Stage popup=new Stage();
						String str="Total revenue till now : "+Float.toString(sale);
						System.out.println(str);
//						Label t1=new Label("REVENUE");
//						Label t=new Label(str);
//						HBox vbox1=new HBox();
//						vbox1.setAlignment(Pos.CENTER);
//					    vbox1.setPadding(new Insets(10));
//					    vbox1.setSpacing(8);
//					    vbox1.setMaxWidth(Double.MAX_VALUE);
//						vbox1.getChildren().addAll(t1,t);
//						popup.setScene(new Scene(vbox1,100,100));
//						popup.show();
//						long mtime=System.currentTimeMillis();
//						long time=mtime+5000;
//						while(System.currentTimeMillis()<time)
//						{
//							
//						}
						s1.close();
						//popup.close();
						
						try {
							start(s3);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				
				b1.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						createWarehouse(s1,t1,t2,s3,1);
					}
				});
				
				b2.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						createStore(s1,t1,t2,s3,2);
					}
				});
				
				b3.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						check(s1,t1,t2,s3,1);
					}
				});
				
				b4.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						check(s1,t1,t2,s3,2);
					}
				});
				
				b5.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						link(s1,t1,t2,s3,1);
					}
				});
			    
				b6.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						deleteWS(s1,t1,t2,s3,1);
					}
				});
				b7.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
						deleteWS(s1,t1,t2,s3,2);
					}
				});
			    
			    vbox.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,logout);
			    //Group g=new Group(title1,vbox);
			    //g.getChildren().addAll(title,vbox);
			    Scene scene=new Scene(vbox);
			    s1.sizeToScene(); 
			    s1.setScene(scene);
			}
			else
			{
				
				Text l=new Text("Wrong password entered.Enter again");
				long mtime=System.currentTimeMillis();
				long t=mtime+3000;
				Stage s2=new Stage();
				s2.sizeToScene(); 
				VBox vbox=new VBox();
				vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(10));
			    vbox.setSpacing(8);
			    vbox.setMaxWidth(Double.MAX_VALUE);
			    vbox.getChildren().add(l);
			    s2.setScene(new Scene(vbox));
			    s2.show();
				while(System.currentTimeMillis()<t)
				{
					//System.out.println("h");
					
				}
				s2.close();
				s1.close();
				funcStoreAdmin(s3);					
			}
		}
	
	
	if(flag==0)
	{
		Label l=new Label("Username is wrong.Enter again");
		long mtime=System.currentTimeMillis();
		long t=mtime+3000;
		Stage s2=new Stage();
		s2.sizeToScene(); 
		VBox vbox=new VBox();
		vbox.setAlignment(Pos.CENTER);
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(8);
	    vbox.setMaxWidth(Double.MAX_VALUE);
	    vbox.getChildren().add(l);
	    s2.setScene(new Scene(vbox));
	    s2.show();
		while(System.currentTimeMillis()<t)
		{
			
			
		}
		s2.close();
		s1.close();
		funcStoreAdmin(s3);
	}
	}
	///////////////////////////////////////////////////////////////////////
	
	/**
	 * This function allows store administrator to select the functionality he wants to perform like ordering items,viewing inventory rtc.
	 * 
	 * @param s1
	 * @param t1
	 * @param t2
	 * @param s3
	 */
	void submitHandle2(Stage s1,TextField t1,TextField t2,Stage s3)
	{
		int flag=0;
		
		for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
		{
			if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
			{
				flag=1;
				if(t2.getText().equals(Project.s.AllStoreAdmins.get(i).getpassword()))
				{
					if(flag2==0)
					{
						flag2=1;
						Project.s.AllStoreAdmins.get(i).getStore().getInventory().EmptyItems(Project.s.AllStoreAdmins.get(i).getStore());
					}
					
					VBox vbox=new VBox();
					vbox.setAlignment(Pos.CENTER);
				    vbox.setPadding(new Insets(10));
				    vbox.setSpacing(8);
				    vbox.setMaxWidth(Double.MAX_VALUE);
				    Text title1 = new Text();
				    title1.setText("OPTIONS");
					title1.setFont(Font.font("Arial", FontWeight.BOLD, 15));
					vbox.getChildren().add(title1);
					
//				    Button b1=new Button("Add category");
//				    b1.setMaxWidth(600);
//				    b1.setOnAction(new EventHandler<ActionEvent>() {
//						@Override
//						public void handle(ActionEvent arg0) {
//							// TODO Auto-generated method stub
//							Addcategory1(s1,t1,t2,s3,0);
//						}
//				    });
//				    
				    Button b2=new Button("Delete category");
				    b2.setMaxWidth(600);
				    b2.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							delete1(s1,t1,t2,s3,1,0);
						}
				    });
				    
//				    Button b3=new Button("Add subcategory");
//				    b3.setMaxWidth(600);
//				    b3.setOnAction(new EventHandler<ActionEvent>() {
//						@Override
//						public void handle(ActionEvent arg0) {
//							// TODO Auto-generated method stub
//							AddSubcategory1(s1,t1,t2,s3,0);
//						}
//				    });
				    
				    Button b4=new Button("Delete subcategory");
				    b4.setMaxWidth(600);
				    b4.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							delete1(s1,t1,t2,s3,2,0);
						}
				    });
				    
				    Button b5=new Button("Add Item");
				    b5.setMaxWidth(600);
				    b5.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							OrderItems(s1,t1,t2,s3);
						}
				    });
				    
				    Button b6=new Button("Delete Item");
				    b6.setMaxWidth(600);
				    b6.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							delete1(s1,t1,t2,s3,3,0);
						}
				    });
				    
				    Button b7=new Button("Update Inventory");
				    b7.setMaxWidth(600);
				    b7.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							updateInventory(s1,t1,t2,s3,0);
						}
				    });
				    
				    Button b8=new Button("View Inventory");
				    b8.setMaxWidth(600);
				    b8.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							inventory(s1,t1,t2,s3,1);
						}
				    });
				    
			        Button logout=new Button("LOGOUT");
			        logout.setMaxWidth(400);
					logout.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							//Stage s=new Stage();
							s1.close();
							try {
								start(s3);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});
				    
				    vbox.getChildren().addAll(b5,b2,b4,b6,b7,b8,logout);
				    //Group g=new Group(title1,vbox);
				    //g.getChildren().addAll(title,vbox);
				    Scene scene=new Scene(vbox);
				    s1.setScene(scene);
				}
				else
				{
					
					Label l=new Label("Wrong password entered.Enter again");
					long mtime=System.currentTimeMillis();
					long t=mtime+2000;
					Stage s2=new Stage();
					s2.sizeToScene();
					VBox vbox=new VBox();
					vbox.setAlignment(Pos.CENTER);
				    vbox.setPadding(new Insets(10));
				    vbox.setSpacing(8);
				    vbox.setMaxWidth(Double.MAX_VALUE);
				    vbox.getChildren().add(l);
				    s2.setScene(new Scene(vbox));
				    s2.show();
					while(System.currentTimeMillis()<t)
					{
						
						
					}
					s2.close();
					s1.close();
					funcStoreAdmin(s3);					
				}
			}
		}
		
		if(flag==0)
		{
			Label l=new Label("Username is wrong.Enter again");
			long mtime=System.currentTimeMillis();
			long t=mtime+2000;
			Stage s2=new Stage();
			s2.sizeToScene();
			VBox vbox=new VBox();
			vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(8);
		    vbox.setMaxWidth(Double.MAX_VALUE);
		    vbox.getChildren().add(l);
		    s2.setScene(new Scene(vbox));
		    s2.show();
			while(System.currentTimeMillis()<t)
			{
				
				
			}
			s2.close();
			s1.close();
			funcStoreAdmin(s3);
		}

	}
	
//	
	///////////////////////////////////////////////////////////////
	
	/**
	 * This function gives the Warehouse Administrator a option to select the functionality it wants to perform like adding category,subcategory etc.
	 * 
	 * @param s1
	 * @param t1
	 * @param t2
	 * @param s3
	 */
	
	void submitHandle3(Stage s1,TextField t1,TextField t2,Stage s3)
	{
		int flag=0;
		
		for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
		{
			if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
			{
				flag=1;
				if(t2.getText().equals(Project.s.AllWarehouseAdmins.get(i).getpassword()))
				{
					VBox vbox=new VBox();
					vbox.setAlignment(Pos.CENTER);
				    vbox.setPadding(new Insets(10));
				    vbox.setSpacing(8);
				    vbox.setMaxWidth(Double.MAX_VALUE);
				    Text title1 = new Text();
				    title1.setText("OPTIONS");
					title1.setFont(Font.font("Arial", FontWeight.BOLD, 15));
					vbox.getChildren().add(title1);
					Button b1=new Button("Add category");
				    b1.setMaxWidth(600);
				    b1.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							Addcategory1(s1,t1,t2,s3,1);
						}
				    });
				    
				    /////////////////////pop up window/////////////
				    if(flag1==0)
				    {
				    	flag1=1;
				    	Stage temps=new Stage();
					    VBox vbox1=new VBox();
						vbox1.setAlignment(Pos.CENTER);
					    vbox1.setPadding(new Insets(10));
					    vbox1.setSpacing(8);
					    vbox1.setMaxWidth(Double.MAX_VALUE);
					    Text title2 = new Text();
					    title2.setText("Items needed to be ordered");
						title2.setFont(Font.font("Arial", FontWeight.BOLD, 15));
						vbox1.getChildren().add(title2);
						ListView<String> orders=new ListView<String>();
						ArrayList<Item> a=Project.s.AllWarehouseAdmins.get(i).ItemsToBeOrdered();
						for(int k=0;k<a.size();k++)
						{
							orders.getItems().add(a.get(k).getName());
						}
						vbox1.getChildren().addAll(orders);
						temps.setScene(new Scene(vbox1));
						temps.show();
				    }
				    
					/////////////
				    
				    Button b2=new Button("Delete category");
				    b2.setMaxWidth(600);
				    b2.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							delete1(s1,t1,t2,s3,1,1);
						}
				    });
				    
				    Button b3=new Button("Add subcategory");
				    b3.setMaxWidth(600);
				    b3.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							AddSubcategory1(s1,t1,t2,s3,1);
						}
				    });
				    
				    Button b4=new Button("Delete subcategory");
				    b4.setMaxWidth(600);
				    b4.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							delete1(s1,t1,t2,s3,2,1);
						}
				    });
				    
				    Button b5=new Button("Add Item");
				    b5.setMaxWidth(600);
				    b5.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							Additem1(s1,t1,t2,s3,1);
						}
				    });
				    
				    Button b6=new Button("Delete Item");
				    b6.setMaxWidth(600);
				    b6.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							delete1(s1,t1,t2,s3,3,1);
						}
				    });
				    
				    Button b7=new Button("Update Inventory");
				    b7.setMaxWidth(600);
				    b7.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							updateInventory(s1,t1,t2,s3,1);
						}
				    });
				    
				    Button b8=new Button("Check data of other warehouse");
				    b8.setMaxWidth(600);
				    b8.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							checkWarehouse(s1,t1,t2,s3);
						}
				    });
				    Button b9=new Button("View Inventory");
				    b9.setMaxWidth(600);
				    b9.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							inventory(s1,t1,t2,s3,2);
						}
				    });
				    
			        Button logout=new Button("LOGOUT");
			        logout.setMaxWidth(400);
					logout.setOnAction(new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent arg0) {
							// TODO Auto-generated method stub
							
							//Stage s=new Stage();
							flag1=0;
							s1.close();
							try {
								start(s3);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					});
				    
				    vbox.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,logout);
				    //Group g=new Group(title1,vbox);
				    //g.getChildren().addAll(title,vbox);
				    Scene scene=new Scene(vbox);
				    s1.setScene(scene);
				}
				else
				{
					
					Label l=new Label("Wrong password entered.Enter again");
					long mtime=System.currentTimeMillis();
					long t=mtime+2000;
					Stage s2=new Stage();
					s2.sizeToScene();
					VBox vbox=new VBox();
					vbox.setAlignment(Pos.CENTER);
				    vbox.setPadding(new Insets(10));
				    vbox.setSpacing(8);
				    vbox.setMaxWidth(Double.MAX_VALUE);
				    vbox.getChildren().add(l);
				    s2.setScene(new Scene(vbox));
				    s2.show();
					while(System.currentTimeMillis()<t)
					{
						
						
					}
					s2.close();
					s1.close();
					funcStoreAdmin(s3);					
				}
			}
		}
		
		if(flag==0)
		{
			Label l=new Label("Username is wrong.Enter again");
			long mtime=System.currentTimeMillis();
			long t=mtime+2000;
			Stage s2=new Stage();
			s2.sizeToScene();
			VBox vbox=new VBox();
			vbox.setAlignment(Pos.CENTER);
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(8);
		    vbox.setMaxWidth(Double.MAX_VALUE);
		    vbox.getChildren().add(l);
		    s2.setScene(new Scene(vbox));
		    s2.show();
			while(System.currentTimeMillis()<t)
			{
				
				
			}
			s2.close();
			s1.close();
			funcStoreAdmin(s3);
		}

	}
	/////////////////////////////////////////////////////////////////
	/**
	 * 
	 * Function used to order item from warehouse by store Administrator.
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 */
	void OrderItems(Stage st,TextField t1,TextField t2,Stage s3)
	{
		Label label1 = new Label("Enter Item:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
	    Label label2 = new Label("Enter Quantity:");
	    TextField textField2 = new TextField ();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    
	    Button order=new Button("ORDER");
	    order.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
				{
					//System.out.println("loop 1");
					if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
					{
						//System.out.println("if 1");
						System.out.println(Project.s.AllStoreAdmins.get(i).getStore().getWarehouse().getName());
						System.out.println(Project.s.AllStoreAdmins.get(i).getStore().getWarehouse().getInventory().AllItems.size());
						for (Map.Entry<Item,Integer> entry : Project.s.AllStoreAdmins.get(i).getStore().getWarehouse().getInventory().AllItems.entrySet())
						{
							//System.out.println("loop 2");
							if(entry.getKey().getName().equals(textField1.getText()))
							{
								//System.out.println("Calling order");
								System.out.println(entry.getKey().getName()+"	"+textField2.getText()+"	December 3,2018");
								Project.s.AllStoreAdmins.get(i).getStore().order(entry.getKey(), Integer.parseInt(textField2.getText()));
							}
						}
					}
					
				}
				submitHandle2(st,t1,t2,s3);
			}
	    	
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb1,hb2,order);
	    st.setScene(new Scene(vbox));
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * This function gives super user ability to delete a store or warehouse..
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param op
	 */
	void deleteWS(Stage st,TextField t1,TextField t2,Stage s3,int op)
	{
		 Label label1 = new Label("Enter Id:");
		    TextField textField1 = new TextField ();
		    HBox hb1 = new HBox();
		    hb1.getChildren().addAll(label1, textField1);
		    hb1.setSpacing(10);
		    hb1.setAlignment(Pos.CENTER);
		    
		    Button create=new Button("REMOVE");
		    create.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					if(op==1)
					{
						Project.Supuser.deleteWarehouse(Integer.parseInt(textField1.getText()));
					}
					else
					{
						Project.Supuser.deleteStore(Integer.parseInt(textField1.getText()));
					}
					
					submitHandle1(st,t1,t2,s3);
				}
		    	
		    });
		    VBox vbox=new VBox();
		    vbox.setPadding(new Insets(10));
		    vbox.setSpacing(20);
		    vbox.setAlignment(Pos.CENTER);
		    vbox.getChildren().addAll(hb1,create);
		    st.setScene(new Scene(vbox));
	}
	
	/**
	 * This function is used to create a new warehouse and warehouse admin.
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param val
	 */
	void createWarehouse(Stage st,TextField t1,TextField t2,Stage s3,int val)
	{
		Label label1 = new Label("Enter Name:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
		Label label6 = new Label("Enter City Number:");
	    TextField textField6 = new TextField ();
	    HBox hb6 = new HBox();
	    hb6.getChildren().addAll(label6, textField6);
	    hb6.setSpacing(10);
	    hb6.setAlignment(Pos.CENTER);
	    
	    Label label2 = new Label("Enter Id number:");
	    TextField textField2 = new TextField ();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    
	    Label label3 = new Label("Enter Admin name:");
	    TextField textField3 = new TextField ();
	    HBox hb3 = new HBox();
	    hb3.getChildren().addAll(label3, textField3);
	    hb3.setSpacing(10);
	    hb3.setAlignment(Pos.CENTER);
	    
	    Label label4 = new Label("Enter Admin username:");
	    TextField textField4 = new TextField ();
	    HBox hb4 = new HBox();
	    hb4.getChildren().addAll(label4, textField4);
	    hb4.setSpacing(10);
	    hb4.setAlignment(Pos.CENTER);
	    
	    Label label5 = new Label("Enter Admin password:");
	    TextField textField5 = new TextField ();
	    HBox hb5 = new HBox();
	    hb5.getChildren().addAll(label5, textField5);
	    hb5.setSpacing(10);
	    hb5.setAlignment(Pos.CENTER);
	    
	    Button create=new Button("CREATE");
	    create.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Project.Supuser.addWarehouse(textField1.getText(), Integer.parseInt(textField2.getText()), textField4.getText(), textField5.getText(),Integer.parseInt(textField6.getText()));
				submitHandle1(st,t1,t2,s3);
			}
	    	
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb1,hb6,hb2,hb3,hb4,hb5,create);
	    st.setScene(new Scene(vbox));
	}
	//////////////////////////////////////////////////////////
	/**
	 * This is used to display list of all warehouse and store to Super User.
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param val
	 */
	
	void check(Stage st,TextField t1,TextField t2,Stage s3,int val)
	{
		Label label1 = new Label();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1);
	    hb1.setAlignment(Pos.CENTER);
	    ListView<String> list=new ListView<String>();
	    if(val==1)
	    {
	    	label1.setText("ALL WAREHOUSES");
	    	ArrayList<String> a=Project.Supuser.SeeAllWarehouses();
	    	if(a!=null)
	    	{
	    		list.getItems().addAll(a);
	    	}
	    }
	    else
	    {
	    	label1.setText("ALL STORES");
	    	ArrayList<String> a=Project.Supuser.SeeAllStores();
	    	if(a!=null)
	    	{
	    		list.getItems().addAll(a);
	    	}
	    }
	    Button back=new Button("BACK");
	    
	    back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				submitHandle1(st,t1,t2,s3);
			}
	    });
	    
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb1,list,back);
	    st.setScene(new Scene(vbox));
	    		
	}
	
	/////////////////////////////////////////////////////////////////
	
	/**
	 * This function links a warehouse and store by taking store id and warehouse id as input.
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param val
	 */
	void link(Stage st,TextField t1,TextField t2,Stage s3,int val)
	{
		Label label1 = new Label("Enter Warehouse Id:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
	    Label label2 = new Label("Enter Store Id:");
	    TextField textField2 = new TextField ();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    
	    Button ok=new Button("OK");
	    
	    ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Project.Supuser.link(Integer.parseInt(textField1.getText()), Integer.parseInt(textField2.getText()));
				submitHandle1(st,t1,t2,s3);
			}
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb1,hb2,ok);
	    st.setScene(new Scene(vbox));
	}
	
	//////////////////////////////////////////////////
	
	/**
	 * This function create new store and store Admin.It links the store to a specific warehouse that is taken 
	 * by the user.
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param val
	 */
	
	void createStore(Stage st,TextField t1,TextField t2,Stage s3,int val)
	{
		Label label1 = new Label("Enter Name:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
	    Label label2 = new Label("Enter Id number:");
	    TextField textField2 = new TextField ();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    
	    Label label3 = new Label("Enter Admin name:");
	    TextField textField3 = new TextField ();
	    HBox hb3 = new HBox();
	    hb3.getChildren().addAll(label3, textField3);
	    hb3.setSpacing(10);
	    hb3.setAlignment(Pos.CENTER);
	    
	    Label label4 = new Label("Enter Admin username:");
	    TextField textField4 = new TextField ();
	    HBox hb4 = new HBox();
	    hb4.getChildren().addAll(label4, textField4);
	    hb4.setSpacing(10);
	    hb4.setAlignment(Pos.CENTER);
	    
	    Label label5 = new Label("Enter Admin password:");
	    TextField textField5 = new TextField ();
	    HBox hb5 = new HBox();
	    hb5.getChildren().addAll(label5, textField5);
	    hb5.setSpacing(10);
	    hb5.setAlignment(Pos.CENTER);
	    
	    Label label6 = new Label("Enter Warehouse id:");
	    TextField textField6 = new TextField ();
	    HBox hb6 = new HBox();
	    hb6.getChildren().addAll(label6, textField6);
	    hb6.setSpacing(10);
	    hb6.setAlignment(Pos.CENTER);
	    
	    Button create=new Button("CREATE");
	    create.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Warehouse w = null;
				int flag=0;
				for(int i=0;i<Project.s.AllWarehouses.size();i++)
				{
					if(Integer.parseInt(textField6.getText())==Project.s.AllWarehouses.get(i).getId())
					{
						w=Project.s.AllWarehouses.get(i);
						flag=1;
					}
				}
				if(flag==0)
				{
					////if warehouse does not exist then issue,remaining
				}
				
				Project.Supuser.addStore(textField1.getText(), Integer.parseInt(textField2.getText()),w, textField4.getText(), textField5.getText());
				submitHandle1(st,t1,t2,s3);
			}
	    	
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb1,hb2,hb3,hb4,hb5,hb6,create);
	    st.setScene(new Scene(vbox));
	}
	//////////////////////////////////////////////////////////
	/**
	 * This function is used to add a new category in Warehouse.This function is called by warehouse Admin.
	 * 
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param a
	 */
	
	void Addcategory1(Stage st,TextField t1,TextField t2,Stage s3,int a)
	{
		Label label1 = new Label("Enter category name:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
//	    Label label2 = new Label("Enter Quantity:");
//	    TextField textField2 = new TextField ();
//	    HBox hb2 = new HBox();
//	    hb2.getChildren().addAll(label2, textField2);
//	    hb2.setSpacing(10);
//	    hb2.setAlignment(Pos.CENTER);
	    
	    Button ok=new Button("OK"); 
	    ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
				{
					if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
					{
						Project.s.AllWarehouseAdmins.get(i).addCategory(textField1.getText());
					}
					
				}
				submitHandle3(st,t1,t2,s3);
			}
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb1,ok);
	    st.setScene(new Scene(vbox));
	}
	
	//////////////////////////////////////////////////////////
	
	/**
	 * delete1 function is used to delete category,Sub-Category or Item from inventory of warehouse or Store.This function is called by store Admin and Warehouse Admin.
	 * 
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param val
	 * @param a
	 */
	
	void delete1(Stage st,TextField t1,TextField t2,Stage s3,int val,int a)
	{
		Label label1 = new Label("Enter name:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
	    Button ok=new Button("DELETE"); 
	    ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(val==1 && a==1) {
					for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
					{
						if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
						{
							Project.s.AllWarehouseAdmins.get(i).deleteCategory(textField1.getText());
						}
						
					}
					submitHandle3(st,t1,t2,s3);
				}
				else if(val==2 && a==1)
				{
					for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
					{
						if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
						{
							Project.s.AllWarehouseAdmins.get(i).deleteSubcategory(textField1.getText());
						}
						
					}
					submitHandle3(st,t1,t2,s3);
				}
				else if(val==3 && a==1)
				{
					for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
					{
						if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
						{
							Project.s.AllWarehouseAdmins.get(i).deleteItem(textField1.getText());
						}
						
					}
					submitHandle3(st,t1,t2,s3);
					
				}
				else if(val==1 && a==0)
				{
					
					for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
					{
						if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
						{
							Category c=null;
							for(int j=0;j<Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllCategories.size();j++)
							{
								if(textField1.getText().equals(Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllCategories.get(j).getName())) {
									c=Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllCategories.get(j);
								}
							}
							Project.s.AllStoreAdmins.get(i).getStore().getInventory().deleteCategory(c);
						}
						
					}
					submitHandle2(st,t1,t2,s3);
				}
				
				else if(val==2 && a==0)
				{
					for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
					{
						if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
						{
							Category c=null;
							Subcategory s=null;
							for(int j=0;j<Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllCategories.size();j++)
							{
								c=Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllCategories.get(j);
								for(int k=0;k<c.ListOfSubcategories.size();k++)
								{
									if(textField1.getText().equals(c.ListOfSubcategories.get(k).getName()))
									{
										s=c.ListOfSubcategories.get(k);
									}
								}
								
							}
							
							Project.s.AllStoreAdmins.get(i).getStore().getInventory().delete_subcategory(c, s);
						}
						
					}
					submitHandle2(st,t1,t2,s3);
				}
				
				else if(val==3 && a==0)
				{
					for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
					{
						if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
						{
							Item it=null;
							for (Map.Entry<Item,Integer> entry : Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllItems.entrySet())
							{
								if(entry.getKey().getName().equals(textField1.getText()))
								{
									it=entry.getKey();
									
								}
							}
							Project.s.AllStoreAdmins.get(i).getStore().getInventory().deleteItem(it);
						}
						
					}
					submitHandle2(st,t1,t2,s3);
				}
				
				
			}
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb1,ok);
	    st.setScene(new Scene(vbox));
	}
	
	////////////////////////////////////////////////////////////////////////
	
	/**
	 * AddSubcategory1 is used add a new Sub-category in Warehouse.This function is called by warehouse Admin. 
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param a
	 */
	void AddSubcategory1(Stage st,TextField t1,TextField t2,Stage s3,int a)
	{
		Label label0 = new Label("Enter category name:");
	    TextField textField0 = new TextField ();
	    HBox hb0 = new HBox();
	    hb0.getChildren().addAll(label0, textField0);
	    hb0.setSpacing(10);
	    hb0.setAlignment(Pos.CENTER);
	    
		Label label1 = new Label("Enter subcategory name:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
//	    Label label2 = new Label("Enter Quantity:");
//	    TextField textField2 = new TextField ();
//	    HBox hb2 = new HBox();
//	    hb2.getChildren().addAll(label2, textField2);
//	    hb2.setSpacing(10);
//	    hb2.setAlignment(Pos.CENTER);
//	    
	    Button ok=new Button("OK"); 
	    ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
				{
					if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
					{
						Project.s.AllWarehouseAdmins.get(i).AddSubcategory(textField0.getText(),textField1.getText());
					}
					
				}
				submitHandle3(st,t1,t2,s3);
			}
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb0,hb1,ok);
	    st.setScene(new Scene(vbox));
	}
	//////////////////////////////////////////////////////////
	

	
	///////////////////////////////////////////////////////////////
	
	/**
	 * SuperUserHandle class handles the event of selecting user type as End User.
	 * 
	 * @author Anushika and Akshyta
	 *
	 */
	
	class SupuserHandle implements EventHandler<ActionEvent>{

		Stage s;
		
		SupuserHandle(Stage sw)
		{
			s=sw;
		}
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			sup s1 = new sup(s);
			Thread t = new Thread(s1);
			t.start();
		}
		
	}

	
	/////////////////////////////////////////////////////////////////////
	
	/**
	 * 
	 * Function is used to add item to warehouse.Called by warehouse administrator.
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param a
	 */
	
	void Additem1(Stage st,TextField t1,TextField t2,Stage s3,int a)
	{
		Label label0 = new Label("Enter category name:");
	    TextField textField0 = new TextField ();
	    HBox hb0 = new HBox();
	    hb0.getChildren().addAll(label0, textField0);
	    hb0.setSpacing(10);
	    hb0.setAlignment(Pos.CENTER);
	    
		Label label6 = new Label("Enter Sub-category name:");
	    TextField textField6 = new TextField ();
	    HBox hb6 = new HBox();
	    hb6.getChildren().addAll(label6, textField6);
	    hb6.setSpacing(10);
	    hb6.setAlignment(Pos.CENTER);
	    
		Label label1 = new Label("Enter item name:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
	    Label label2 = new Label("Enter Quantity:");
	    TextField textField2 = new TextField ();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    
	    Label label3 = new Label("Enter D:");
	    TextField textField3 = new TextField ();
	    HBox hb3 = new HBox();
	    hb3.getChildren().addAll(label3, textField3);
	    hb3.setSpacing(10);
	    hb3.setAlignment(Pos.CENTER);
	    
	    Label label4 = new Label("Enter H:");
	    TextField textField4 = new TextField ();
	    HBox hb4 = new HBox();
	    hb4.getChildren().addAll(label4, textField4);
	    hb4.setSpacing(10);
	    hb4.setAlignment(Pos.CENTER);
	    
	    Label label5 = new Label("Enter K:");
	    TextField textField5 = new TextField ();
	    HBox hb5 = new HBox();
	    hb5.getChildren().addAll(label5, textField5);
	    hb5.setSpacing(10);
	    hb5.setAlignment(Pos.CENTER);
	    
	    
	    
	    Button ok=new Button("OK"); 
	    ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
				{
					if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
					{
						int Dval=Integer.parseInt(textField3.getText());
						int Hval=Integer.parseInt(textField4.getText());
						int Kval=Integer.parseInt(textField5.getText());
						int Qval=Integer.parseInt(textField2.getText());
						Project.s.AllWarehouseAdmins.get(i).AddItem(textField0.getText(),textField6.getText(),textField1.getText(),Dval,Kval,Hval,Qval);
					}
					
				}
				submitHandle3(st,t1,t2,s3);
			}
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(hb0,hb6,hb1,hb2,hb3,hb4,hb5,ok);
	    st.setScene(new Scene(vbox));
	}
	
	/////////////////////////////////////////////////
	
	/**
	 *Update inventory function is used to update the cost of item and update the quantity of item in inventory of store or warehouse.
	 *
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 * @param a
	 */
	

	void updateInventory(Stage st,TextField t1,TextField t2,Stage s3,int a)
	{
		ChoiceBox<String> c=new ChoiceBox<String>();
		c.getItems().add("Update D");
		c.getItems().add("Update K");
		c.getItems().add("Update H");
		c.getItems().add("Update Quantity");
		
		Label label1 = new Label("Enter item name:");
	    TextField textField1 = new TextField ();
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(label1, textField1);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
	    Label label2 = new Label("Enter New value:");
	    TextField textField2 = new TextField ();
	    HBox hb2 = new HBox();
	    hb2.getChildren().addAll(label2, textField2);
	    hb2.setSpacing(10);
	    hb2.setAlignment(Pos.CENTER);
	    
	    Button ok=new Button("OK"); 
	    ok.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				String value = (String) c.getValue();
				if(value!=null)
				{
					if(a==1)
					{
						
					if(value.equals("Update Quantity"))
					{
						for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
						{
							if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
							{
								Project.s.AllWarehouseAdmins.get(i).UpdateQuantity(textField1.getText(),Integer.parseInt(textField2.getText()));
							}
							
						}
					}
					else if(value.equals("Update D"))
					{
						for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
						{
							if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
							{
								for (Map.Entry<Item,Integer> entry : Project.s.AllWarehouseAdmins.get(i).getWarehouse().getInventory().AllItems.entrySet())
								{
									if(entry.getKey().getName().equals(textField1.getText()))
									{
										entry.getKey().get_cost().update_D(Integer.parseInt(textField2.getText()));
									}
								}
							}
							
						}
					}
					else if(value.equals("Update K"))
					{
						for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
						{
							if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
							{
								for (Map.Entry<Item,Integer> entry : Project.s.AllWarehouseAdmins.get(i).getWarehouse().getInventory().AllItems.entrySet())
								{
									if(entry.getKey().getName().equals(textField1.getText()))
									{
										entry.getKey().get_cost().update_K(Integer.parseInt(textField2.getText()));
									}
								}
							}
							
						}
					}
					else
					{
						for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
						{
							if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
							{
								for (Map.Entry<Item,Integer> entry : Project.s.AllWarehouseAdmins.get(i).getWarehouse().getInventory().AllItems.entrySet())
								{
									if(entry.getKey().getName().equals(textField1.getText()))
									{
										entry.getKey().get_cost().update_H(Integer.parseInt(textField2.getText()));
									}
								}
							}
							
						}
					}
					submitHandle3(st,t1,t2,s3);
					}
					else
					{
						if(value.equals("Update Quantity"))
						{
							for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
							{
								if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
								{
									for (Map.Entry<Item,Integer> entry : Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllItems.entrySet())
									{
										if(entry.getKey().getName().equals(textField1.getText()))
										{
											Project.s.AllStoreAdmins.get(i).getStore().getInventory().UpdateQuantity(entry.getKey(), Integer.parseInt(textField2.getText()));
										}
									}
								}
								
							}
						}
						else if(value.equals("Update D"))
						{
							for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
							{
								if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
								{
									for (Map.Entry<Item,Integer> entry : Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllItems.entrySet())
									{
										if(entry.getKey().getName().equals(textField1.getText()))
										{
											entry.getKey().get_cost().update_D(Integer.parseInt(textField2.getText()));
										}
									}
								}
								
							}
						}
						else if(value.equals("Update K"))
						{
							for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
							{
								if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
								{
									for (Map.Entry<Item,Integer> entry : Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllItems.entrySet())
									{
										if(entry.getKey().getName().equals(textField1.getText()))
										{
											entry.getKey().get_cost().update_K(Integer.parseInt(textField2.getText()));
										}
									}
								}
								
							}
						}
						else
						{
							for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
							{
								if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
								{
									for (Map.Entry<Item,Integer> entry : Project.s.AllStoreAdmins.get(i).getStore().getInventory().AllItems.entrySet())
									{
										if(entry.getKey().getName().equals(textField1.getText()))
										{
											entry.getKey().get_cost().update_K(Integer.parseInt(textField2.getText()));
										}
									}
								}
								
							}
						}
						submitHandle2(st,t1,t2,s3);
					}
					
					
				}
				
			}
	    });
	    VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(c,hb1,hb2,ok);
	    st.setScene(new Scene(vbox));
	}
	
	///////////////////////////////////////////////////////
	
	/**
	 * To display details of other warehouses to warehouse administrator.
	 * 
	 * @param st
	 * @param t1
	 * @param t2
	 * @param s3
	 */
	
	void checkWarehouse(Stage st,TextField t1,TextField t2,Stage s3)
	{
		ChoiceBox<String> c=new ChoiceBox<String>();
		
		for(int i=0;i<Project.s.AllWarehouses.size();i++)
		{
			c.getItems().add(Project.s.AllWarehouses.get(i).getName());
		}
		Label l=new Label();
		VBox vbox=new VBox();
	    vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    
		if(Project.s.AllWarehouses.size()==0)
		{
			l.setText("No other Warehouse");
			vbox.getChildren().add(l);
		}
		else
		{
			vbox.getChildren().add(c);
		}
		c.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>()
				{
					@Override
					public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
						// TODO Auto-generated method stub
						helper( st,t1,t2, s3,Project.s.AllWarehouses.get(arg2.intValue()));
					}
			
				});
	    Button back=new Button("BACK"); 
	    back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				submitHandle3(st,t1,t2,s3);
			}
	    });
	    
	    vbox.getChildren().add(back);
		
		st.setScene(new Scene(vbox));
	}
	
	///////////////////////////////////////////////////////////////////////////////
	
	void helper(Stage st,TextField t1,TextField t2,Stage s3,Warehouse w)
	{
		ListView<String> list=new ListView<String>();
		
		String s;
		for (Map.Entry<Item,Integer> entry : w.getInventory().AllItems.entrySet())
		{
			s=entry.getKey().getCategory().getName()+"	"+entry.getKey().getName()+"	"+Integer.toString(entry.getValue());
			list.getItems().add(s);
		}
		
		Button back=new Button("BACK"); 
	    back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				checkWarehouse( st,t1,t2,s3);
			}
	    });
	    
		 VBox vbox=new VBox();
		 vbox.setPadding(new Insets(10));
		 vbox.setSpacing(20);
		 vbox.setAlignment(Pos.CENTER);
		 vbox.getChildren().addAll(list,back);
		 st.setScene(new Scene(vbox));
		
	}
	///////////////////////////////////////////////////////////////////
	
	/**
	 * This function is used to display inventory items to Store Admin and Warehouse Admin
	 * 
	 * @param st(Stage)
	 * @param t1(TextField)
	 * @param t2(TexyField)
	 * @param s3(Stage)
	 * @param val(Integer)
	 */
	void inventory(Stage st,TextField t1,TextField t2,Stage s3,int val)
	{
		ListView<String> list=new ListView<String>();
		Inventory in=null;
		if(val==1) {
			for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
			{ 
				if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
				{
					in=Project.s.AllStoreAdmins.get(i).getStore().getInventory();
					break;
				}
			}
			}
			else
			{
				for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
				{
					if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
					{
						in=Project.s.AllWarehouseAdmins.get(i).getWarehouse().getInventory();
						break;
					}
				}
			}
			
		
		if(in!=null)
		{
			String s;
			for (Map.Entry<Item,Integer> entry : in.AllItems.entrySet())
			{
				s=entry.getKey().getCategory().getName()+"	"+entry.getKey().getName()+"	"+Integer.toString(entry.getValue());
				list.getItems().add(s);
			}
		}
		
		

	    Label sortoption=new Label("Sorting options");
	    ChoiceBox<String> sortChoice=new ChoiceBox<String>();
	    sortChoice.setMaxWidth(400);
	    sortChoice.getItems().addAll("Sort by ItemName","Sort by price","Sort by category");
	    HBox hb1 = new HBox();
	    hb1.getChildren().addAll(sortoption,sortChoice);
	    hb1.setSpacing(10);
	    hb1.setAlignment(Pos.CENTER);
	    
//	    sortChoice.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
//				// TODO Auto-generated method stub
//				if(arg2.intValue()==0)
//				{
//					ArrayList<String> al=in.sortItemByName();
//				}
//			}
//	    	
//	    });	    
	    Button apply=new Button("APPLY"); 
	    hb1.getChildren().add(apply);
	    apply.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				Inventory inr=null;
				if(val==1) {
					for(int i=0;i<Project.s.AllStoreAdmins.size();i++)
					{ 
						if(t1.getText().equals(Project.s.AllStoreAdmins.get(i).getlogin_id()))
						{
							inr=Project.s.AllStoreAdmins.get(i).getStore().getInventory();
							break;
						}
					}
					}
					else
					{
						for(int i=0;i<Project.s.AllWarehouseAdmins.size();i++)
						{
							if(t1.getText().equals(Project.s.AllWarehouseAdmins.get(i).getlogin_id()))
							{
								inr=Project.s.AllWarehouseAdmins.get(i).getWarehouse().getInventory();
								break;
							}
						}
					}
				if(inr!=null) {
				String value = (String) sortChoice.getValue();
				if(value.equals("Sort by ItemName"))
				{
					ArrayList<String> al=inr.sortItemByName();
					list.getItems().clear();
					list.getItems().addAll(al);
				}
				else if(value.equals("Sort by category"))
				{
					ArrayList<String> al=inr.sortItemByCategory();
					list.getItems().clear();
					list.getItems().addAll(al);
				}
				else
				{
					ArrayList<String> al=inr.sortItemByCost();
					list.getItems().clear();
					list.getItems().addAll(al);
				}
				}
			}
	    });

	    Button back=new Button("BACK"); 
	    back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(val==1) {
				submitHandle2(st,t1,t2,s3);
				}
				else
				{
					submitHandle3(st,t1,t2,s3);
				}
			}
	    });
	    
		 VBox vbox=new VBox();
		 vbox.setPadding(new Insets(10));
		 vbox.setSpacing(20);
		 vbox.setAlignment(Pos.CENTER);
		 vbox.getChildren().addAll(list,hb1,back);
		 st.setScene(new Scene(vbox));
	}
	
	///////////////////////////////////////////////////////////

	///////////////////////////////////////////////////////////
	
	/**
	 * 
	 * StoeAdminHandle class implements EventHandler and is used to handle the event of selecting the user type as Store Admin.
	 * 
	 * @author Anushika and Akshyta
	 *
	 */	
	
class StoreAdminHandle implements EventHandler<ActionEvent>{
		
		Stage s;
		StoreAdminHandle(Stage sw)
		{
			s=sw;
		}
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			sadmin s1 = new sadmin(s);
			Thread t = new Thread(s1);
			t.start();
			
			
		}
		
	}
	
	////////////////////////////////////////////////////////
/**
 * 
 * WareAdminHandle class implements EventHandler and is used to handle the event of selecting the user type as Warehouse Admin
 * 
 * @author Anushika and Akshyta
 *
 */
	
	class WareAdminHandle implements EventHandler<ActionEvent>{

		Stage s;
		
		WareAdminHandle(Stage s)
		{
			this.s=s;
		}
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			wadmin s1 = new wadmin(s);
			Thread t = new Thread(s1);
			t.start();
			
			
		}
		
	}
	
	////////////////////////////////////////////////////////
	/**
	 * 
	 * EndUserHandle class implements EventHandler and is used to handle the event of selecting the user type as EndUser
	 * 
	 * @author Anushika and Akshyta
	 *
	 */
	class EndUserHandle implements EventHandler<ActionEvent>{

		Stage s;
		EndUserHandle(Stage s)
		{
			this.s=s;
		}
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			euser s1 = new euser(s);
			Thread t = new Thread(s1);
			
			t.start();
		}
		
	}
	/**
	 * 
	 * 
	 *This class implements interface runnable which is used to make an independent thread to execute operations of SuperUser .
	 *@author Anushika and Akshyta
	 */

	class sup implements Runnable
	{
		Stage s;
		sup(Stage s)
		{
			this.s=s;
		}
		public void run() 
		{
			
			System.out.println("SuperUser started.");
			Platform.runLater(new Runnable()
			{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						funcSuperUser(s);
						}
				
			});
			
			
		}
	}
	
	/**
	 * 
	 * 
	 *This class implements interface runnable which is used to make an independent thread to execute operations of Warehouse Admin .
	 *@author Anushika and Akshyta
	 */
	class wadmin implements Runnable
	{
		Stage s;
		wadmin(Stage s)
		{
			this.s=s;
		}
		public void run() 
		{
			System.out.println("WarehouseAdmin started.");
			Platform.runLater(new Runnable()
			{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						funcWareAdmin(s);
						}
				
			});

			
		}
		
	}
	/**
	 * 
	 * 
	 *This class implements interface runnable which is used to make an independent thread to execute operations of Store Admin .
	 *@author Anushika and Akshyta
	 */
	class sadmin implements Runnable
	{
		Stage s;
		sadmin(Stage s)
		{
			this.s=s;
		}
		public void run() 
		{
			System.out.println("StoreAdmin started.");
			Platform.runLater(new Runnable()
			{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						funcStoreAdmin(s);
						}
				
			});
			
			
		}
	}
	/**
	 * 
	 * 
	 *
	 *This class implements interface runnable which is used to make an independent thread to execute operations of end user.
	 * @author Anushika and Akshyta
	 */
	
	class euser implements Runnable
	{
		Stage s;
		euser(Stage s)
		{
			this.s=s;
		}
		public void run() 
		{
			System.out.println("EndUser started.");
			Platform.runLater(new Runnable()
			{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						funcEndUser1(s);
						}
				
			});
			
		}
	}
	//////////////////////////////////////////////////////////
	/**
	 * Start function is invoked when window.java is executed.It creates a stage that gives option to user to select user type(SuperUser,Store Administrator,Warehouse Administrator,End User)
	 */
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		//GridPane grid = new GridPane();
		arg0.setTitle("SuperStore");
		Label mainlabel=new Label("Super Store");
		mainlabel.setFont(Font.font("Arial", FontWeight.BOLD, 20));
		Button[] mainbuttons=new Button[5];
		mainbuttons[0]=new Button("Super User");
		mainbuttons[1]=new Button("Store Administrator");
		mainbuttons[2]=new Button("Warehouse Administrator");
		mainbuttons[3]=new Button("End User");
		mainbuttons[4]=new Button("Exit");
		for(int i=0;i<4;i++)
		{
			mainbuttons[i].setMaxWidth(5000);
		}
		mainbuttons[4].setMaxWidth(5000);
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER);
		Text title = new Text("Select User Type");
		title.setFont(Font.font("Arial", FontWeight.BOLD, 15));
		vbox.getChildren().add(title);
		vbox.setPadding(new Insets(10));
	    vbox.setSpacing(20);
	    for(int i=0;i<5;i++)
	    {
	    	vbox.getChildren().add(mainbuttons[i]);
	    }
	    VBox vbox2 = new VBox();
		vbox2.setAlignment(Pos.CENTER);
		vbox2.setPadding(new Insets(10));
	    vbox2.setSpacing(8);
	    vbox2.getChildren().add(mainlabel);
	    vbox2.getChildren().add(vbox);
	    Scene mcscene=new Scene(vbox2);
	    arg0.setScene(mcscene);
	    SupuserHandle handle1=new SupuserHandle(arg0);
	    mainbuttons[0].setOnAction(handle1);
	    
	    StoreAdminHandle handle2=new StoreAdminHandle(arg0);
	    mainbuttons[1].setOnAction(handle2);
	    
	    WareAdminHandle handle3=new WareAdminHandle(arg0);
	    mainbuttons[2].setOnAction(handle3);
	    
	    EndUserHandle handle4=new EndUserHandle(arg0);
	    mainbuttons[3].setOnAction(handle4);
	    
	    mainbuttons[4].setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Label l=new Label("Thank you for using the system");
				long mtime=System.currentTimeMillis();
				long t=mtime+2000;
				Stage s2=new Stage();
				s2.sizeToScene();
				VBox vbox=new VBox();
				vbox.setAlignment(Pos.CENTER);
			    vbox.setPadding(new Insets(10));
			    vbox.setSpacing(8);
			    vbox.setMaxWidth(Double.MAX_VALUE);
			    vbox.getChildren().add(l);
			    s2.setScene(new Scene(vbox));
			    s2.show();
				while(System.currentTimeMillis()<t)
				{
					
					
				}
				s2.close();
				Project.Serialize(Project.s);
				Platform.exit();
				
			}
	    });
	    
	    
		arg0.show();

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project.main(args);
		Application.launch(args);
	}

}