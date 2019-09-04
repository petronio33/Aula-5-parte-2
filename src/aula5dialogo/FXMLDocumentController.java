/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5dialogo;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    //Usar por exemplo como "salvar"
    private void abrirDialogos(ActionEvent event) {
        //caixa de dialogo
        //Tipos de icones
        //Alert.AlertType.INFORMATION - informação
        //Alert.AlertType.ERROR  - erro
        //Alert.AlertType.WARNING  - atenção
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Titulo da caixa de alerta");//titulo
        alerta.setHeaderText("Mensagem de Cabeçalho");//cabeçalho
        alerta.setContentText("Parabéns você está programando");//conteudo
        alerta.showAndWait();//mostrando o alerta
        
        //Caixa de Confirmação
        Alert confirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        confirmacao.setTitle("Isso mesmo?");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("Deseja me doar seu salário?");
        
        //Pegando a resposta atravez do botão que foi selecionado
        Optional<ButtonType> resp = confirmacao.showAndWait();
        
        //Verificar qual botão foi pressionado
        if(resp.get()==ButtonType.OK){
            //apertou o botão ok
            ///faça algo
            System.out.println("Doou");
        }
        
        //Dialogo de entrada de dados
        TextInputDialog entrada = new TextInputDialog();
        entrada.setTitle("titulo");
        entrada.setHeaderText(null);
        entrada.setContentText("Digite sua idade");
        
        //Pegando a String que a pessoa digitou
        Optional<String> texto = entrada.showAndWait();
        
        //Imprimindo o texto digitado
        System.out.println(texto.get());
    }
    
}
