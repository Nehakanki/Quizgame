public class quiz {
    @FXML
    private Button playquizbtn;

    @FXML
    private void initialize(){
        playquizbtn.setOnAction(new EventHandler<ActionEvent>()
                                {
                                    @override
                                    public void handle(ActionEvent event){
                                        Stage thisstage =(Stage)((Button)event.getSource()).getScence().getWindw();
                                        thisstage.close();

                                        EXMLLoader fxmlLoader = new FXML
                                    }
                                }
        )
    }
}
