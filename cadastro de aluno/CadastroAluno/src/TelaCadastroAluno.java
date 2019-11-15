import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class TelaCadastroAluno {
	private static Text jtxRA;
	private static Text jtxNome;
	private static Text jtxDtNasc;
	private static Text jtxCPF;
	private static Text jtxRG;
	private static Text jtxSexo;
	private static Text jtxEmail;
	private static Text jtxEndere�o;
	private static Text jtxNumero;
	private static Text jtxBairro;
	private static Text jtxCidade;
	private static Text jtxEstado;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(775, 296);
		shell.setText("SWT Application");
		
		Label lblRa = new Label(shell, SWT.NONE);
		lblRa.setBounds(51, 10, 55, 15);
		lblRa.setText("RA:");
		
		jtxRA = new Text(shell, SWT.BORDER);
		jtxRA.setBounds(51, 31, 157, 21);
		
		Label lblNome = new Label(shell, SWT.NONE);
		lblNome.setBounds(226, 10, 55, 15);
		lblNome.setText("Nome:");
		
		jtxNome = new Text(shell, SWT.BORDER);
		jtxNome.setBounds(226, 31, 257, 21);
		
		Label lblDa = new Label(shell, SWT.NONE);
		lblDa.setBounds(501, 10, 157, 15);
		lblDa.setText("Data de nascimento:");
		
		jtxDtNasc = new Text(shell, SWT.BORDER);
		jtxDtNasc.setBounds(501, 31, 194, 21);
		
		Label lblCpf = new Label(shell, SWT.NONE);
		lblCpf.setBounds(51, 63, 55, 15);
		lblCpf.setText("CPF:");
		
		jtxCPF = new Text(shell, SWT.BORDER);
		jtxCPF.setBounds(51, 84, 157, 21);
		
		Label lblRg = new Label(shell, SWT.NONE);
		lblRg.setBounds(226, 63, 55, 15);
		lblRg.setText("RG:");
		
		jtxRG = new Text(shell, SWT.BORDER);
		jtxRG.setBounds(226, 84, 162, 21);
		
		Label lblSexo = new Label(shell, SWT.NONE);
		lblSexo.setBounds(407, 63, 55, 15);
		lblSexo.setText("Sexo:");
		
		jtxSexo = new Text(shell, SWT.BORDER);
		jtxSexo.setBounds(407, 82, 76, 21);
		
		Label lblEmail = new Label(shell, SWT.NONE);
		lblEmail.setBounds(501, 63, 55, 15);
		lblEmail.setText("E-mail:");
		
		jtxEmail = new Text(shell, SWT.BORDER);
		jtxEmail.setBounds(501, 82, 194, 21);
		
		Label lblEndereo = new Label(shell, SWT.NONE);
		lblEndereo.setBounds(51, 114, 55, 15);
		lblEndereo.setText("Endere\u00E7o:");
		
		jtxEndere�o = new Text(shell, SWT.BORDER);
		jtxEndere�o.setBounds(51, 135, 337, 21);
		
		jtxNumero = new Text(shell, SWT.BORDER);
		jtxNumero.setBounds(407, 135, 76, 21);
		
		Label lblNmero = new Label(shell, SWT.NONE);
		lblNmero.setBounds(407, 114, 55, 15);
		lblNmero.setText("N\u00FAmero:");
		
		Label lblBairro = new Label(shell, SWT.NONE);
		lblBairro.setBounds(501, 114, 55, 15);
		lblBairro.setText("Bairro:");
		
		jtxBairro = new Text(shell, SWT.BORDER);
		jtxBairro.setBounds(501, 135, 194, 21);
		
		Label lblCep = new Label(shell, SWT.NONE);
		lblCep.setBounds(51, 178, 55, 15);
		lblCep.setText("CEP:");
		
		Text jtxCEP = new Text(shell, SWT.BORDER);
		jtxCEP.setBounds(51, 199, 113, 21);
		
		jtxCidade = new Text(shell, SWT.BORDER);
		jtxCidade.setBounds(170, 199, 169, 21);
		
		Label lblCidade = new Label(shell, SWT.NONE);
		lblCidade.setBounds(170, 178, 55, 15);
		lblCidade.setText("Cidade:");
		
		Label lblEstado = new Label(shell, SWT.NONE);
		lblEstado.setBounds(345, 178, 55, 15);
		lblEstado.setText("Estado:");
		
		Button btnValidar = new Button(shell, SWT.NONE);
		btnValidar.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
			/////////////////////
				if(jtxRA.getText().isEmpty()){
					System.out.println("RA � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				
				String tamanhoRA =jtxRA.getText();
				
				if(tamanhoRA.length() > 8) {
					System.out.println("RA DEVE POSSUIR NO M�XIMO 8 N�MEROS");
				}
				
				
				if (!jtxRA.getText().isEmpty()) {
					jtxRA.setText(jtxRA.getText().replace(',', '.')); //permite digitar com , ou .
			           try {
			               Integer.parseInt(jtxRA.getText()); //tenta fazer a convers�o
			           } catch (NumberFormatException ex){ //se n�o conseguir levanta uma exce��o
			               System.out.println("O RA DEVE CONTER SOMENTE N�MEROS");
			               
			           }
			        }
				
				
			/////////////////////////Q
				if(jtxNome.getText().isEmpty()){
					System.out.println("NOME � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				if(jtxDtNasc.getText().isEmpty()){
					System.out.println("DATA NASCIMENTO � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 LocalDate dataVerificada = LocalDate.parse(jtxDtNasc.getText(), dtf);
				 LocalDate hoje = LocalDate.now();
				 if(dataVerificada.compareTo(hoje) > 0){
					 System.out.println("A DATA DE NASCIMENTO N�O PODE SER MAIOR QUE A DATA DE HOJE");
				 }
				
				
				if(jtxCPF.getText().isEmpty()){
					System.out.println("CPF � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				
				String tamanhoCPF =jtxCPF.getText(); 
				
				if (tamanhoCPF.length()!=11){
					System.out.println("CPF DEVE TER 11 N�MEROS");
				}
				
				if (!jtxCPF.getText().isEmpty()) {
					jtxCPF.setText(jtxCPF.getText().replace(',', '.')); //permite digitar com , ou .
			           try {
			               Float.parseFloat(jtxCPF.getText()); //tenta fazer a convers�o
			           } catch (NumberFormatException exex){ //se n�o conseguir levanta uma exce��o
			               System.out.println("O CPF DEVE CONTER SOMENTE N�MEROS");
			               
			           }
			        }
				
				if(jtxSexo.getText().isEmpty()){
					System.out.println("SEXO � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				if(jtxEmail.getText().isEmpty()){
					System.out.println("EMAIL � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				if(jtxEndere�o.getText().isEmpty()){
					System.out.println("ENDERE�O � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				
				String tamanhoEndereco = jtxEndere�o.getText();
				
				if(tamanhoEndereco.length() >60){
					System.out.println("O ENDERE�O DEVE CONTER NO M�XIMO 60 CARACTERES");
				}
				
				
				if(jtxNumero.getText().isEmpty()){
					System.out.println("NUMERO � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				
				if (!jtxNumero.getText().isEmpty()) {
					jtxNumero.setText(jtxNumero.getText().replace(',', '.')); //permite digitar com , ou .
			           try {
			               Integer.parseInt(jtxNumero.getText()); //tenta fazer a convers�o
			           } catch (NumberFormatException ex){ //se n�o conseguir levanta uma exce��o
			               System.out.println("O NUMERO DO ENDERE�O DEVE CONTER SOMENTE N�MEROS");
			               
			           }
			        }
				
				if(jtxBairro.getText().isEmpty()){
					System.out.println("BAIRRO � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				if(jtxCidade.getText().isEmpty()){
					System.out.println("CIDADE � DE PREENCHIMENTO OBRIGAT�RIO");
				}
				
				if(jtxEstado.getText().isEmpty()){
					System.out.println("ESTADO � DE PREENCHIMENTO OBRIGAT�RIO");
				}
					
					
				
			}
		});
		btnValidar.setBounds(467, 195, 75, 25);
		btnValidar.setText("Validar");
		
		jtxEstado = new Text(shell, SWT.BORDER);
		jtxEstado.setBounds(345, 199, 103, 21);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
