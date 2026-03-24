/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ClienteDAO;
import controller.UsuarioDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Usuario;

/**
 *
 * @author clebe
 */
public class TelaCliente1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente1() {
        initComponents();
    }

    //Metodo Listar na tabela
    public void listar() {

        ClienteDAO dao = new ClienteDAO();

        List<Cliente> lista = dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) jTblClientes.getModel();
        dados.setNumRows(0);

        for (Cliente c : lista) {
            dados.addRow(new Object[]{
                c.getNome(),
                c.getDocumento(),
                c.getTipoCliente(),
                c.getEmail(),
                c.getLogradouro(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getCep(),
                c.getDataCadastro(),
                c.getObservacoes()
                });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTpClientes = new javax.swing.JTabbedPane();
        jPnCadastro = new javax.swing.JPanel();
        jTxtCep = new javax.swing.JFormattedTextField();
        jRdBtnJuridica = new javax.swing.JRadioButton();
        jRdBtnFisica = new javax.swing.JRadioButton();
        jCbxUF = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxtObs = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtDocumento = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jTxtNumero = new javax.swing.JTextField();
        jTxtComplemento = new javax.swing.JTextField();
        jTxtBairro = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxtTelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBtnAdicionar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        Consultas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblClientes = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTxtConsultaNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxtConsultaDocumento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtConsultaTelefone = new javax.swing.JFormattedTextField();
        jTxtConsultaEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        try {
            jTxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTxtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtCepKeyPressed(evt);
            }
        });

        jRdBtnJuridica.setText("Pessoa Jurídica");
        jRdBtnJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRdBtnJuridicaActionPerformed(evt);
            }
        });

        jRdBtnFisica.setText("Pessoa Física");

        jCbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RR", "SC", "SE", "SP", "TO" }));

        jTxtObs.setColumns(20);
        jTxtObs.setRows(5);
        jScrollPane2.setViewportView(jTxtObs);

        jLabel3.setText("Observações");

        jLabel10.setText("Cidade");

        jTxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumeroActionPerformed(evt);
            }
        });

        try {
            jTxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Nome");

        jLabel2.setText("Documento");

        jLabel4.setText("Telefone");

        jLabel5.setText("e-mail");

        jLabel6.setText("Endereço");

        jLabel7.setText("Nº");

        jLabel8.setText("Complemento");

        jLabel9.setText("Bairro");

        jLabel11.setText("Cep");

        jLabel13.setText("UF");

        jBtnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/create.png"))); // NOI18N
        jBtnAdicionar.setToolTipText("Adiconar Usuário");
        jBtnAdicionar.setMaximumSize(new java.awt.Dimension(80, 80));
        jBtnAdicionar.setMinimumSize(new java.awt.Dimension(80, 80));
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jBtnEditar.setToolTipText("Editar Usuário");
        jBtnEditar.setEnabled(false);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jBtnExcluir.setToolTipText("Excluir Usuário");
        jBtnExcluir.setEnabled(false);
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnCadastroLayout = new javax.swing.GroupLayout(jPnCadastro);
        jPnCadastro.setLayout(jPnCadastroLayout);
        jPnCadastroLayout.setHorizontalGroup(
            jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                        .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnCadastroLayout.createSequentialGroup()
                                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtComplemento))
                            .addGroup(jPnCadastroLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(12, 12, 12)
                                .addComponent(jTxtBairro))
                            .addGroup(jPnCadastroLayout.createSequentialGroup()
                                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel11))
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                                        .addComponent(jTxtCep, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                                        .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTxtEmail))
                                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                                        .addComponent(jTxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRdBtnJuridica)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRdBtnFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTxtNome))))
                        .addContainerGap())))
            .addGroup(jPnCadastroLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jBtnEditar)
                .addGap(130, 130, 130)
                .addComponent(jBtnExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPnCadastroLayout.setVerticalGroup(
            jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15))
                    .addGroup(jPnCadastroLayout.createSequentialGroup()
                        .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRdBtnJuridica)
                            .addComponent(jRdBtnFisica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jCbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTpClientes.addTab("Cadastro", jPnCadastro);

        jTblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Documento", "Tipo Cliente", "Telefone", "E-mail", "Endereço", "Número", "Complemento", "Bairro", "Cidade ", "Estado", "Cep", "Observações"
            }
        ));
        jTblClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblClientes);

        jLabel12.setText("Nome");

        jTxtConsultaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtConsultaNomeKeyPressed(evt);
            }
        });

        jLabel14.setText("Documento");

        jLabel15.setText("Telefone");

        try {
            jTxtConsultaTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9 ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setText("e-mail");

        javax.swing.GroupLayout ConsultasLayout = new javax.swing.GroupLayout(Consultas);
        Consultas.setLayout(ConsultasLayout);
        ConsultasLayout.setHorizontalGroup(
            ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ConsultasLayout.createSequentialGroup()
                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ConsultasLayout.createSequentialGroup()
                        .addComponent(jTxtConsultaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtConsultaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
                    .addComponent(jTxtConsultaNome)
                    .addComponent(jTxtConsultaDocumento))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ConsultasLayout.setVerticalGroup(
            ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTxtConsultaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtConsultaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTxtConsultaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
        );

        jTpClientes.addTab("Consulta", Consultas);

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTpClientes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTpClientes)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        listar();
    }//GEN-LAST:event_formWindowOpened

    private void jTblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblClientesMouseClicked
        jTpClientes.setSelectedIndex(0);
        jTxtNome.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 0).toString());
        jTxtDocumento.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 1).toString());
        jTxtTelefone.setText(jTblClientes.getValueAt(jTblClientes.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTblClientesMouseClicked

    private void jTxtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCepKeyPressed
        //Programacao do keypress
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cliente obj = new Cliente();
            ClienteDAO dao = new ClienteDAO();
            obj = dao.buscaCep(jTxtCep.getText());

            jTxtEndereco.setText(obj.getLogradouro());
            jTxtBairro.setText(obj.getBairro());
            jTxtCidade.setText(obj.getCidade());
            jCbxUF.setSelectedItem(obj.getEstado());
            // System.out.println(obj.getEstado());
            jTxtNumero.requestFocus();
        }
    }//GEN-LAST:event_jTxtCepKeyPressed

    private void jRdBtnJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRdBtnJuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRdBtnJuridicaActionPerformed

    private void jTxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNumeroActionPerformed

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        if ((jTxtNome.getText().isEmpty()) || (jTxtDocumento.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Nome ou documento vazio!!!\nPreencha os campos");
        } else {

            String nome = jTxtNome.getText();
            String documento = jTxtDocumento.getText();
            String tipo;
            if (jRdBtnFisica.isSelected()) {
                tipo = jRdBtnFisica.getText();
            } else {
                tipo = jRdBtnJuridica.getText();
            }
            String telefone = jTxtTelefone.getText().replaceAll("[^0-9]", "");
            String email = jTxtEmail.getText();
            String endereco = jTxtEndereco.getText();
            String numero = jTxtNumero.getText();
            String complemento = jTxtComplemento.getText();
            String bairro = jTxtBairro.getText();
            String cidade = jTxtCidade.getText();
            String uf = jCbxUF.getSelectedItem().toString();
            String cep = jTxtCep.getText().replaceAll("[^0-9]", "");
            String obs = jTxtObs.getText();

            Cliente usuario = new Cliente(nome, documento, tipo, telefone, email, endereco, numero, complemento, bairro, cidade, uf, cep, obs);
            System.out.println(usuario.getEstado());
            System.out.println(usuario.getCep());
            ClienteDAO dao = new ClienteDAO();
            dao.adicionarUsuario(usuario);
            jTxtNome.setText("");
            jTxtEmail.setText(null);
            jTxtDocumento.setText(null);
            jTxtTelefone.setText(null);
            buttonGroup1.isSelected(null);
            jTxtCep.setText(null);
            jTxtEndereco.setText(null);
            jTxtNumero.setText(null);
            jTxtCidade.setText(null);
            jCbxUF.setSelectedItem(null);
            jTxtBairro.setText(null);
            jTxtComplemento.setText(null);
            jTxtObs.setText(null);
            jBtnAdicionar.setEnabled(true);
            jBtnEditar.setEnabled(false);
            jBtnExcluir.setEnabled(false);
        }
        listar();
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        //        if ((jTxtNomeCliente.getText().isEmpty()) || (jTxtSenha.getText().isEmpty())
            //            || (jTxtNomeCompleto.getText().isBlank()) || (jCbxPerfil.getSelectedItem().equals(" ")) || (jTxtEmail.getText().isEmpty())) {
            //            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            //        } else {
            //
            //            String nome = jTxtNomeCliente.getText();
            //            String senha = jTxtSenha.getText();
            //            String perfil = jCbxPerfil.getSelectedItem().toString();
            //            String nomeCompleto = jTxtNomeCompleto.getText();
            //            String email = jTxtEmail.getText();
            //            int id = (int) jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 0);
            //            Cliente usuario = new Cliente(id, nome, senha, perfil, nomeCompleto, email);
            //
            //            ClienteDAO dao = new ClienteDAO();
            //            dao.alterarCliente(usuario);
            //            jTxtNomeCliente.setText("");
            //            jTxtEmail.setText(null);
            //            jTxtNomeCompleto.setText(null);
            //            jTxtSenha.setText(null);
            //            jCbxPerfil.setSelectedItem("Usuário");
            //            jBtnAdicionar.setEnabled(true);
            //            jBtnEditar.setEnabled(false);
            //            jBtnExcluir.setEnabled(false);
            //        }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        //        if ((jTxtNomeCliente.getText().isEmpty()) || (jTxtSenha.getText().isEmpty())
            //            || (jTxtNomeCompleto.getText().isBlank()) || (jCbxPerfil.getSelectedItem().equals(" ")) || (jTxtEmail.getText().isEmpty())) {
            //            JOptionPane.showMessageDialog(null, "Preencha todos os campos!!!");
            //        } else {
            //
            //            ClienteDAO dao = new ClienteDAO();
            //            int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão do Usuário\n" + jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 1));
            //
            //            if (resp == 0) {
                //                dao.excluirCliente((int) jTblCliente.getValueAt(jTblCliente.getSelectedRow(), 0));
                //            }
            //            jTxtNomeCliente.setText("");
            //            jTxtEmail.setText(null);
            //            jTxtNomeCompleto.setText(null);
            //            jTxtSenha.setText(null);
            //            jCbxPerfil.setSelectedItem("Usuário");
            //            jBtnAdicionar.setEnabled(true);
            //            jBtnEditar.setEnabled(false);
            //            jBtnExcluir.setEnabled(false);
            //        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jTxtConsultaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtConsultaNomeKeyPressed
        String nome = "%" + jTxtConsultaNome.getText().trim() + "%";
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> lista = dao.listarClienteNome(nome);
        System.out.println();
        DefaultTableModel dados = (DefaultTableModel) jTblClientes.getModel();
        dados.setNumRows(0);
        
        for (Cliente c : lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getDocumento(),
                c.getTipoCliente(),
                c.getEmail(),
                c.getLogradouro(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
                c.getCep(),
                c.getDataCadastro(),
                c.getObservacoes()
                
            });
        }
    }//GEN-LAST:event_jTxtConsultaNomeKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consultas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JComboBox<String> jCbxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPnCadastro;
    private javax.swing.JRadioButton jRdBtnFisica;
    private javax.swing.JRadioButton jRdBtnJuridica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblClientes;
    private javax.swing.JTabbedPane jTpClientes;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JFormattedTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtConsultaDocumento;
    private javax.swing.JTextField jTxtConsultaEmail;
    private javax.swing.JTextField jTxtConsultaNome;
    private javax.swing.JFormattedTextField jTxtConsultaTelefone;
    private javax.swing.JTextField jTxtDocumento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextArea jTxtObs;
    private javax.swing.JFormattedTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables
}
