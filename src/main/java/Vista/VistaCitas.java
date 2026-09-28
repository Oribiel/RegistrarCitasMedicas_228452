package Vista;

import Modelo.*;
import Control.ControlCitas;
import javax.swing.DefaultListModel;

public class VistaCitas extends javax.swing.JFrame implements IVista {
    private ControlCitas control;
    private DefaultListModel<Medico> listaMedicos = new DefaultListModel<Medico>();
    private boolean actualizando;

    public VistaCitas() {
        initComponents();
        lstMedicos.setModel(listaMedicos);
        panelReserva.setVisible(false);
    }

    public VistaCitas(ControlCitas control) {
        this();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNss = new javax.swing.JLabel();
        txtNss = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblPaciente = new javax.swing.JLabel();
        scrollPaciente = new javax.swing.JScrollPane();
        txtPaciente = new javax.swing.JTextArea();
        lblMedicos = new javax.swing.JLabel();
        scrollMedicos = new javax.swing.JScrollPane();
        lstMedicos = new javax.swing.JList<>();
        lblDetalle = new javax.swing.JLabel();
        scrollDetalle = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();
        panelReserva = new javax.swing.JPanel();
        lblAviso = new javax.swing.JLabel();
        cmbHorarios = new javax.swing.JComboBox<>();
        lblHorario = new javax.swing.JLabel();
        btnApartar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar cita médica");

        lblNss.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblNss.setText("NSS:");

        txtNss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNssActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblPaciente.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblPaciente.setText("Paciente");

        txtPaciente.setEditable(false);
        txtPaciente.setColumns(24);
        txtPaciente.setRows(3);
        scrollPaciente.setViewportView(txtPaciente);

        lblMedicos.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblMedicos.setText("Médicos");

        lstMedicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMedicos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMedicosValueChanged(evt);
            }
        });
        scrollMedicos.setViewportView(lstMedicos);

        lblDetalle.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblDetalle.setText("Datos del médico / cita");

        txtDetalle.setEditable(false);
        txtDetalle.setColumns(30);
        txtDetalle.setLineWrap(true);
        txtDetalle.setRows(10);
        txtDetalle.setWrapStyleWord(true);
        scrollDetalle.setViewportView(txtDetalle);

        javax.swing.GroupLayout panelReservaLayout = new javax.swing.GroupLayout(panelReserva);
        panelReserva.setLayout(panelReservaLayout);
        panelReservaLayout.setHorizontalGroup(
            panelReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );
        panelReservaLayout.setVerticalGroup(
            panelReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lblAviso.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblAviso.setText("Ingrese el NSS del paciente.");

        cmbHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHorariosActionPerformed(evt);
            }
        });

        lblHorario.setText("Fecha y hora disponibles:");

        btnApartar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnApartar.setText("Apartar cita");
        btnApartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollMedicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMedicos)
                                    .addComponent(lblPaciente)
                                    .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNss)
                                .addGap(18, 18, 18)
                                .addComponent(txtNss, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDetalle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 836, Short.MAX_VALUE)
                    .addComponent(panelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblHorario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 651, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnApartar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDetalle)
                            .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(scrollDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHorario))
                        .addGap(139, 139, 139)
                        .addComponent(btnApartar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNss, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNss, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(lblPaciente)
                        .addGap(30, 30, 30)
                        .addComponent(scrollPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMedicos)
                        .addGap(35, 35, 35)
                        .addComponent(scrollMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGap(10, 10, 10)
                .addComponent(panelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPaciente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNssActionPerformed
        buscarPaciente();
    }//GEN-LAST:event_txtNssActionPerformed

    private void btnApartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartarActionPerformed
        apartarCita();
    }//GEN-LAST:event_btnApartarActionPerformed

    private void lstMedicosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMedicosValueChanged
        if (!actualizando && !evt.getValueIsAdjusting()
                && lstMedicos.getSelectedValue() != null) {
            seleccionarMedico();
        }
    }//GEN-LAST:event_lstMedicosValueChanged

    private void cmbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHorariosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApartar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Modelo.Horario> cmbHorarios;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblDetalle;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblMedicos;
    private javax.swing.JLabel lblNss;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JList<Modelo.Medico> lstMedicos;
    private javax.swing.JPanel panelReserva;
    private javax.swing.JScrollPane scrollDetalle;
    private javax.swing.JScrollPane scrollMedicos;
    private javax.swing.JScrollPane scrollPaciente;
    private javax.swing.JTextArea txtDetalle;
    private javax.swing.JTextField txtNss;
    private javax.swing.JTextArea txtPaciente;
    // End of variables declaration//GEN-END:variables

    public void buscarPaciente() {
        control.buscarPaciente(txtNss.getText());
    }
    public void seleccionarMedico() {
        control.seleccionarMedico(lstMedicos.getSelectedValue());
    }
    public void apartarCita() {
        control.apartarCita((Horario) cmbHorarios.getSelectedItem());
    }

    @Override
    public void update(IModelo consulta) {
        actualizando = true;
        try {
            refrescarDatos(consulta);
        } finally {
            actualizando = false;
        }
    }

    private void refrescarDatos(IModelo consulta) {
        Paciente paciente = consulta.getPaciente();
        Medico medico = consulta.getMedicoSeleccionado();
        Cita cita = consulta.getCita();
        lblAviso.setText(consulta.getAviso());
        listaMedicos.clear();
        if (paciente == null) {
            txtPaciente.setText("Paciente: pendiente de busqueda");
        } else {
            txtPaciente.setText("Paciente: " + paciente.getNombre()
                    + "\nNSS: " + paciente.getNss() + "\nEdad: " + paciente.getEdad());
            for (Medico item : consulta.getMedicos()) {
                listaMedicos.addElement(item);
            }
            lstMedicos.setSelectedValue(medico, true);
        }

        cmbHorarios.removeAllItems();
        panelReserva.setVisible(cita == null && medico != null);
        if (cita != null) {
            txtDetalle.setText("CITA REGISTRADA\n\nPaciente: " + cita.getPaciente().getNombre()
                    + "\nNSS: " + cita.getPaciente().getNss()
                    + "\nEdad: " + cita.getPaciente().getEdad()
                    + "\nMedico: " + cita.getMedico().getNombre()
                    + "\nConsultorio: " + cita.getMedico().getConsultorio()
                    + "\nFecha: " + cita.getHorario().getFecha()
                    + "\nHora: " + cita.getHorario().getHora());
        } else if (medico != null) {
            txtDetalle.setText("DATOS DEL MEDICO\n\nNombre: " + medico.getNombre()
                    + "\nEspecialidad: " + medico.getEspecialidad()
                    + "\nConsultorio: " + medico.getConsultorio()
                    + "\nDias de consulta: " + medico.getDiasConsulta()
                    + "\nHoras de consulta: " + medico.getHorasConsulta());
            for (Horario horario : consulta.getHorariosDisponibles()) {
                cmbHorarios.addItem(horario);
            }
            btnApartar.setEnabled(cmbHorarios.getItemCount() > 0);
        } else {
            txtDetalle.setText("Busque un paciente y seleccione un medico.");
        }
        revalidate();
        repaint();
    }
}
