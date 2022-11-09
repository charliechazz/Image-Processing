import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Math.pow;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ProyectoFinal extends javax.swing.JFrame{
    
    FileInputStream in;
    FileOutputStream out;
    File archivo;
    private ImageIcon mIcon;
    JFileChooser seleccionado = new JFileChooser();
    String ruta, rutax;
    byte[] bytesImg;
    File f, file2;
    boolean flag = false;
    BufferedImage buffer;
    int a = 0;
    private int cnt;
    
    public ProyectoFinal(){
        initcomponents();
    }
    
    public byte[] AbrirImagen(File archivo) {
        byte[] bytesImg = new byte[2048 * 200];
        try {
            in = new FileInputStream(archivo);
            in.read(bytesImg);
        } catch (Exception e) {
        }
        return bytesImg;
    }
    
    public String GuardarImagen(File archivo, byte[] bytesImg) {
        String respuesta = null;
        try {
            out = new FileOutputStream(archivo);
            out.write(bytesImg);
            respuesta = "La imagen se guardo con exito.";
        } catch (Exception e) {
        }
        return respuesta;
    }
    
    private void initcomponents(){

        negativo = new javax.swing.JMenuItem();
        jmenu1 = new javax.swing.JMenu();
        seleccionar = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        menubar = new javax.swing.JMenuBar();
        jmenu2 = new javax.swing.JMenu();
        jmenu3 = new javax.swing.JMenu();
        escala = new javax.swing.JMenuItem();
        aumentarbrillo = new javax.swing.JMenuItem();
        binarizacion = new javax.swing.JMenuItem();
        disminuirbrillo = new javax.swing.JMenuItem();
        foto = new javax.swing.JLabel();
        jmenu4 = new javax.swing.JMenu();
        laplaceano = new javax.swing.JMenuItem();
        prewitt = new javax.swing.JMenuItem();
        roberts = new javax.swing.JMenuItem();
        sobel = new javax.swing.JMenuItem();
        
        foto.setSize(1000, 1000);
        foto.setBounds(10, 10, 800, 600);
        add(foto);
        
        negativo.setText("jMenuitem1");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jmenu1.setText("Archivo ");
        
        seleccionar.setText("Abrir imagen");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });
        jmenu1.add(seleccionar);   
        
        guardar.setText("Guardar imagen");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jmenu1.add(guardar);
        
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jmenu1.add(salir);
        
        menubar.add(jmenu1);
        
        jmenu2.setText("Operadores");
        
        negativo.setText("Negativo");
        negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativoActionPerformed(evt);
            }
        });
        jmenu2.add(negativo);
        
        escala.setText("Escala de Grises");
        escala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escalaActionPerformed(evt);
            }
        });
        jmenu2.add(escala);

        jmenu3.setText("Potencia");
        
        aumentarbrillo.setText("Aumentar Brilo");
        aumentarbrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarbrilloActionPerformed(evt);
            }
        });
        jmenu3.add(aumentarbrillo);
        
        disminuirbrillo.setText("Disminuir Brillo ");
        disminuirbrillo.setToolTipText("");
        disminuirbrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disminuirbrilloActionPerformed(evt);
            }
        });
        jmenu3.add(disminuirbrillo);
        
        jmenu2.add(jmenu3);
        
        binarizacion.setText("Binarizacion");
        binarizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarizacionActionPerformed(evt);
            }
        });
        jmenu2.add(binarizacion);
        
        menubar.add(jmenu2);
        
        jmenu4.setText("Bordes");
        
        laplaceano.setText("Laplaceano");
        laplaceano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laplaceanoActionPerformed(evt);
            }
        });
        jmenu4.add(laplaceano);
        
        prewitt.setText("Prewitt");
        prewitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prewittActionPerformed(evt);
            }
        });
        jmenu4.add(prewitt);
        
        roberts.setText("Roberts");
        roberts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robertsActionPerformed(evt);
            }
        });
        jmenu4.add(roberts);
        
        sobel.setText("Sobel");
        sobel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobelActionPerformed(evt);
            }
        });
        jmenu4.add(sobel);
        
        menubar.add(jmenu4);
        
        setJMenuBar(menubar);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(59, Short.MAX_VALUE).addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(59, 59, 59)));
        
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(25, 25, 25).addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(29, Short.MAX_VALUE)));
        
        pack();
        
    }
    
    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {
        ruta ="";
        seleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes ", "jpg","png");
        seleccionado.setFileFilter(filtro);
        int respuesta= seleccionado.showOpenDialog(this);
        
        if (respuesta==JFileChooser.APPROVE_OPTION) {
            ruta = seleccionado.getSelectedFile().getPath();
            
            Image img0 = new ImageIcon(ruta).getImage();
            int h=foto.getHeight();
            int w=foto.getWidth();
            mIcon = new ImageIcon(img0.getScaledInstance(w, h, Image.SCALE_SMOOTH));
            foto.setIcon(mIcon);
        }
    }
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {
        if (flag == false) {
            if (seleccionado.showDialog(null, "GUARDAR IMAGEN") == JFileChooser.APPROVE_OPTION) {
                flag = false;
                archivo = seleccionado.getSelectedFile();
                if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                    String respuesta = GuardarImagen(archivo, bytesImg);
                    if (respuesta != null) {
                        JOptionPane.showMessageDialog(null, respuesta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar imagen.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La imagen se debe guardar en formato de imagen.");
                }
            }
        } else {
            guardar();
        }
    }
    
    public void guardar() {
        JFileChooser seleccionado2 = new JFileChooser();
        if (seleccionado2.showDialog(null, "GUARDAR IMAGEN") == JFileChooser.APPROVE_OPTION) {
            File archivo2 = seleccionado2.getSelectedFile();
            try {
                
                ImageIO.write(buffer, "jpg", archivo2);
                JOptionPane.showMessageDialog(null, "La imagen se guardo con exito.");
            } catch (IOException ex) {
                
            }
        }
        
    }
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
    
    private void escalaActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen2(fn);
    }
    
    private void negativoActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen(fn);
    }
    
    private void aumentarbrilloActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen3(fn);
    }
    
    private void disminuirbrilloActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen4(fn);
    }
    
    private void binarizacionActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen5(fn);
    }
    
    private void laplaceanoActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen6(fn, cnt+=1);
        mostrar();
    }
    
    private void prewittActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen7(fn, cnt+=1);
        mostrar();
    }
    
    private void robertsActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen8(fn, cnt+=1);
        mostrar();
    }
    
    private void sobelActionPerformed(java.awt.event.ActionEvent evt) {
        String fn = ruta.toString();
        if (fn == null) {
            return;
        }
        transformaImagen9(fn, cnt+=1);
        mostrar();
    }
    
    public void transformaImagen(String fn) {
        File f = new File(fn);
        if (!f.exists()) {
            return;
        }
        
        try {
            
            BufferedImage bi = ImageIO.read(f);
            
            if (a == 0) {
                bi = ImageIO.read(f);
                a++;
            } else {
                bi = buffer;
            }
            int width = bi.getWidth();
            int height = bi.getHeight();
            int pels[] = new int[width * height];
            bi.getRGB(0, 0, width, height, pels, 0, width);  	
            ColorModel cm = ColorModel.getRGBdefault(); 		
            short r[][] = new short[width][height];
            short g[][] = new short[width][height];
            short b[][] = new short[width][height];
            int i = 0;
            
            // descompone la imagen en el RGB
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    i = x + y * width;
                    b[x][y] = (short) cm.getBlue(pels[i]); 
                    g[x][y] = (short) cm.getGreen(pels[i]); 
                    r[x][y] = (short) cm.getRed(pels[i]);
                }
            }
            
            // saca el negativo de la imagen
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    r[x][y] = (short) (255 - r[x][y]);
                    g[x][y] = (short) (255 - g[x][y]);
                    b[x][y] = (short) (255 - b[x][y]);
                }
            }
            
            //convierte la imagen en un arreglo
            int pels1[] = new int[width * height];
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    pels1[x + y * width]
                            = 0xff000000
                            | (r[x][y] << 16)
                            | (g[x][y] << 8)
                            | b[x][y];
                }
            }
            
            buffer = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB); 
            buffer.setRGB(0, 0, width, height, pels1, 0, width);

            foto.setIcon(new ImageIcon(buffer.getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_AREA_AVERAGING))); 
            flag = true;
        } catch (Exception e) {
            System.out.println("error en el proceso");
        }
    }
    
    public void transformaImagen2(String fn) {
        
        f = new File(fn);
        if (!f.exists()) {
            return;
        }
        
        try {
            
             BufferedImage bi = ImageIO.read(f);
            
            if (a == 0) {
                bi = ImageIO.read(f);
                a++;
            } else {
                bi = buffer;
            }
            
            int width = bi.getWidth();
            int height = bi.getHeight();
            int pels[] = new int[width * height];
            bi.getRGB(0, 0, width, height, pels, 0, width);  	
            ColorModel cm = ColorModel.getRGBdefault(); 		
            short r[][] = new short[width][height];
            short g[][] = new short[width][height];
            short b[][] = new short[width][height];
            int i = 0;
            
            // descompone la imagen en el RGB
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    i = x + y * width;
                    b[x][y] = (short) cm.getBlue(pels[i]);  //Retorna un arreglo entre 0 y 255 representando el contenido del azul
                    g[x][y] = (short) cm.getGreen(pels[i]); //Retorna un arreglo entre 0 y 255 representando el contenido del verde
                    r[x][y] = (short) cm.getRed(pels[i]);	 //Retorna un arreglo entre 0 y 255 representando el contenido del rojo
                }
            }
            
            //grises
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    r[x][y] = (short) ((r[x][y] + g[x][y] + b[x][y]) / 3);
                    g[x][y] = r[x][y];
                    b[x][y] = r[x][y];
                }
            }
            
            //convierte la imagen en un arreglo
            int pels1[] = new int[width * height];
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    pels1[x + y * width]
                            = 0xff000000
                            | (r[x][y] << 16)
                            | (g[x][y] << 8)
                            | b[x][y];
                }
            }
            
            BufferedImage buffer = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB); 
            buffer.setRGB(0, 0, width, height, pels1, 0, width);
            
            //foto.setIcon(new ImageIcon(buffer));
            foto.setIcon(new ImageIcon(buffer.getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_AREA_AVERAGING)));
            
            flag = true;
            
        } catch (Exception e) {
            System.out.println("error en el proceso");
        }
        
    }
    
    public void transformaImagen3(String fn) {
        
        f = new File(fn);
        if (!f.exists()) {
            return;
        }
        
        try {
            BufferedImage bi;
            if (a == 0) {
                bi = ImageIO.read(f);
                a++;
            } else {
                bi = buffer;
            }
            //produce images in color or gray scale
            int width = bi.getWidth();
            int height = bi.getHeight();
            int pels[] = new int[width * height];
            bi.getRGB(0, 0, width, height, pels, 0, width);
            
            ColorModel cm = ColorModel.getRGBdefault();         
            short r[][] = new short[width][height];
            short g[][] = new short[width][height];
            short b[][] = new short[width][height];
            int i = 0;
            
            // descompone la imagen en el RGB
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    i = x + y * width;
                    b[x][y] = (short) cm.getBlue(pels[i]); 
                    g[x][y] = (short) cm.getGreen(pels[i]); 
                    r[x][y] = (short) cm.getRed(pels[i]);    
                }
            }
            
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    double r12 = r[x][y], g12 = g[x][y], b12 = b[x][y];
                    r[x][y] = (short) (255 * (pow(r12, 0.9) / pow(255, 0.9)));
                    g[x][y] = (short) (255 * (pow(g12, 0.9) / pow(255, 0.9)));
                    b[x][y] = (short) (255 * (pow(b12, 0.9) / pow(255, 0.9)));
                }
            }

            int pels1[] = new int[width * height];
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    pels1[x + y * width]
                            = 0xff000000
                            | (r[x][y] << 16)
                            | (g[x][y] << 8)
                            | b[x][y];
                }
            }
            
            buffer = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB);
            buffer.setRGB(0, 0, width, height, pels1, 0, width);

            foto.setIcon(new ImageIcon(buffer.getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_AREA_AVERAGING)));
            
        } catch (Exception e) {
            System.out.println("error en el proceso");
        }
        flag = true;
    }
    
    public void transformaImagen4(String fn) {
        
        f = new File(fn);
        if (!f.exists()) {
            return;
        }
        
        try {
            BufferedImage bi;
            if (a == 0) {
                bi = ImageIO.read(f);
                a++;
            } else {
                bi = buffer;
            }
            
            int width = bi.getWidth();
            int height = bi.getHeight();
            int pels[] = new int[width * height];
            bi.getRGB(0, 0, width, height, pels, 0, width);
            
            
            ColorModel cm = ColorModel.getRGBdefault();        
            short r[][] = new short[width][height];
            short g[][] = new short[width][height];
            short b[][] = new short[width][height];
            int i = 0;

            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    i = x + y * width;
                    b[x][y] = (short) cm.getBlue(pels[i]); 
                    g[x][y] = (short) cm.getGreen(pels[i]); 
                    r[x][y] = (short) cm.getRed(pels[i]);    
                }
            }
            
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    double r12 = r[x][y], g12 = g[x][y], b12 = b[x][y];
                    r[x][y] = (short) (255 * (pow(r12, 1.1) / pow(255, 1.1)));
                    g[x][y] = (short) (255 * (pow(g12, 1.1) / pow(255, 1.1)));
                    b[x][y] = (short) (255 * (pow(b12, 1.1) / pow(255, 1.1)));
                }
            }
            
            int pels1[] = new int[width * height];
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    pels1[x + y * width]
                            = 0xff000000
                            | (r[x][y] << 16)
                            | (g[x][y] << 8)
                            | b[x][y];
                }
            }
            
            buffer = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB); 
            buffer.setRGB(0, 0, width, height, pels1, 0, width);

            foto.setIcon(new ImageIcon(buffer.getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_AREA_AVERAGING)));
            
        } catch (Exception e) {
            System.out.println("error en el proceso");
        }
        flag = true;
    }
    
    public void transformaImagen5(String fn) {
        f = new File(fn);
        if (!f.exists()) {
            return;
        }
        
        try {
            BufferedImage bi;
            if (a == 0) {
                bi = ImageIO.read(f);
                a++;
            } else {
                bi = buffer;
            }
            
            int width = bi.getWidth();
            int height = bi.getHeight();
            int pels[] = new int[width * height];
            bi.getRGB(0, 0, width, height, pels, 0, width);
            
            
            ColorModel cm = ColorModel.getRGBdefault();        
            short r[][] = new short[width][height];
            short g[][] = new short[width][height];
            short b[][] = new short[width][height];
            int i = 0;
            
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    i = x + y * width;
                    b[x][y] = (short) cm.getBlue(pels[i]); 
                    g[x][y] = (short) cm.getGreen(pels[i]); 
                    r[x][y] = (short) cm.getRed(pels[i]);    
                }
            }
            
            double gris;
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    double r12 = r[x][y], g12 = g[x][y], b12 = b[x][y];
                    gris = (r12 + g12 + b12) / 3;
                    if (gris > 128) {
                        r[x][y] = (short) (255);
                        g[x][y] = (short) (255);
                        b[x][y] = (short) (255);
                    } else {
                        r[x][y] = (short) (0);
                        g[x][y] = (short) (0);
                        b[x][y] = (short) (0);
                    }
                    
                }
            }
            
            int pels1[] = new int[width * height];
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    pels1[x + y * width]
                            = 0xff000000
                            | (r[x][y] << 16)
                            | (g[x][y] << 8)
                            | b[x][y];
                }
            }
            
            buffer = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB);
            buffer.setRGB(0, 0, width, height, pels1, 0, width);

            foto.setIcon(new ImageIcon(buffer.getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_AREA_AVERAGING)));
            
        } catch (Exception e) {
            System.out.println("error en el proceso");
        }
        flag = true;
    }
    
    public void transformaImagen6(String fn, int cnt){
        try{
            
            if (cnt==1) {
                rutax = fn;
            }
            else {
                rutax ="aux.jpg";
            }
            
            File file = new File(rutax);
            BufferedImage image = ImageIO.read(file);
            
            int x = image.getWidth();
            int y = image.getHeight();
            
            int maxGval = 0;
            int[][] edgeColors = new int[x][y];
            int maxGradient = -1;
            
            
            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                    
                    int val00 = getGrayScale(image.getRGB(i - 1, j - 1));
                    int val01 = getGrayScale(image.getRGB(i - 1, j));
                    int val02 = getGrayScale(image.getRGB(i - 1, j + 1));
                    
                    int val10 = getGrayScale(image.getRGB(i, j - 1));
                    int val11 = getGrayScale(image.getRGB(i, j));
                    int val12 = getGrayScale(image.getRGB(i, j + 1));
                    
                    int val20 = getGrayScale(image.getRGB(i + 1, j - 1));
                    int val21 = getGrayScale(image.getRGB(i + 1, j));
                    int val22 = getGrayScale(image.getRGB(i + 1, j + 1));
                    
                    int gx =  ((0 * val00) + (1 * val01) + (0 * val02)) 
                            + ((1 * val10) + (-4 * val11) + (1 * val12))
                            + ((0 * val20) + (1 * val21) + (0 * val22));
                    
                    int gy =  ((0 * val00) + (-1 * val01) + (0 * val02))
                            + ((-1 * val10) + (4 * val11) + (-1 * val12))
                            + ((0 * val20) + (-1 * val21) + (0 * val22));
                    
                    double gval = Math.sqrt((gx * gx) + (gy * gy));
                    int g = (int) gval;
                    
                    if(maxGradient < g) {
                        maxGradient = g;
                    }
                    
                    edgeColors[i][j] = g;
                }
            }
            
            double scale = 255.0 / maxGradient;
            
            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                        int edgeColor = edgeColors[i][j];
                        edgeColor = (int)(edgeColor * scale);
                        edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;
                        image.setRGB(i, j, edgeColor);
                    }
                }
            buffer = image;
            file2 = new File("aux.jpg");
            ImageIO.write(image, "jpg", file2);
            rutax = "aux.jpg";
        }
        catch (Exception e) { JOptionPane.showMessageDialog(null,
            "Error en el proceso",
            "Advertencia",JOptionPane.WARNING_MESSAGE);}
    }
    
    public void transformaImagen7(String fn, int cnt){
        try{
            
            if (cnt==1) {
                rutax = fn;
            }
            else {
                rutax ="aux.jpg";
            }
            
            File file = new File(rutax);
            BufferedImage image = ImageIO.read(file);
            
            int x = image.getWidth();
            int y = image.getHeight();
            
            int maxGval = 0;
            int[][] edgeColors = new int[x][y];
            int maxGradient = -1;
            
            
            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                    
                    int val00 = getGrayScale(image.getRGB(i - 1, j - 1));
                    int val01 = getGrayScale(image.getRGB(i - 1, j));
                    int val02 = getGrayScale(image.getRGB(i - 1, j + 1));
                    
                    int val10 = getGrayScale(image.getRGB(i, j - 1));
                    int val11 = getGrayScale(image.getRGB(i, j));
                    int val12 = getGrayScale(image.getRGB(i, j + 1));
                    
                    int val20 = getGrayScale(image.getRGB(i + 1, j - 1));
                    int val21 = getGrayScale(image.getRGB(i + 1, j));
                    int val22 = getGrayScale(image.getRGB(i + 1, j + 1));
                    
                    int gx =  ((-1 * val00) + (0 * val01) + (1 * val02)) 
                            + ((-1 * val10) + (0 * val11) + (1 * val12))
                            + ((-1 * val20) + (0 * val21) + (1 * val22));
                    
                    int gy =  ((-1 * val00) + (-1 * val01) + (-1 * val02))
                            + ((0 * val10) + (0 * val11) + (0 * val12))
                            + ((1 * val20) + (1 * val21) + (1 * val22));
                    
                    double gval = Math.sqrt((gx * gx) + (gy * gy));
                    int g = (int) gval;
                    
                    if(maxGradient < g) {
                        maxGradient = g;
                    }
                    
                    edgeColors[i][j] = g;
                }
            }
            
            double scale = 255.0 / maxGradient;
            
            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                        int edgeColor = edgeColors[i][j];
                        edgeColor = (int)(edgeColor * scale);
                        edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;
                        image.setRGB(i, j, edgeColor);
                    }
                }
            buffer = image;
            file2 = new File("aux.jpg");
            ImageIO.write(image, "jpg", file2);
            rutax = "aux.jpg";
        }
        catch (Exception e) { JOptionPane.showMessageDialog(null,
            "Error en el proceso",
            "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void transformaImagen8(String fn, int cnt){ 
        try{
            
            if (cnt==1) {
                rutax = fn;
            }
            else {
                rutax ="aux.jpg";
            }
            
            File file = new File(rutax);
            BufferedImage image = ImageIO.read(file);
            
            int x = image.getWidth();
            int y = image.getHeight();
            
            int maxGval = 0;
            int[][] edgeColors = new int[x][y];
            int maxGradient = -1;
            
            
            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                    
                    int val00 = getGrayScale(image.getRGB(i - 1, j - 1));
                    int val01 = getGrayScale(image.getRGB(i - 1, j));
                    
                    int val10 = getGrayScale(image.getRGB(i, j - 1));
                    int val11 = getGrayScale(image.getRGB(i, j));
                    
                    int gx =  ((-1 * val00) + (0 * val01)) 
                            + ((0 * val10) + (1 * val11));
                    
                    int gy =  ((0 * val00) + (-1 * val01))
                            + ((1 * val10) + (0 * val11));
                    
                    double gval = Math.sqrt((gx * gx) + (gy * gy));
                    int g = (int) gval;
                    
                    if(maxGradient < g) {
                        maxGradient = g;
                    }
                    
                    edgeColors[i][j] = g;
                }
            }
            
            double scale = 255.0 / maxGradient;
            
            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                        int edgeColor = edgeColors[i][j];
                        edgeColor = (int)(edgeColor * scale);
                        edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;
                        image.setRGB(i, j, edgeColor);
                    }
                }
            buffer = image;
            file2 = new File("aux.jpg");
            ImageIO.write(image, "jpg", file2);
            rutax = "aux.jpg";
        }
        catch (Exception e) { JOptionPane.showMessageDialog(null,
            "Error en el proceso",
            "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void transformaImagen9(String fn, int cnt){
        try{
            
            if (cnt==1) {
                rutax = fn;
            }
            else {
                rutax ="aux.jpg";
            }
            
            File file = new File(rutax);
            BufferedImage image = ImageIO.read(file);
            
            int x = image.getWidth();
            int y = image.getHeight();
            
            int maxGval = 0;
            int[][] edgeColors = new int[x][y];
            int maxGradient = -1;
            
            
            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                    
                    int val00 = getGrayScale(image.getRGB(i - 1, j - 1));
                    int val01 = getGrayScale(image.getRGB(i - 1, j));
                    int val02 = getGrayScale(image.getRGB(i - 1, j + 1));
                    
                    int val10 = getGrayScale(image.getRGB(i, j - 1));
                    int val11 = getGrayScale(image.getRGB(i, j));
                    int val12 = getGrayScale(image.getRGB(i, j + 1));
                    
                    int val20 = getGrayScale(image.getRGB(i + 1, j - 1));
                    int val21 = getGrayScale(image.getRGB(i + 1, j));
                    int val22 = getGrayScale(image.getRGB(i + 1, j + 1));
                    
                    int gx =  ((-1 * val00) + (0 * val01) + (1 * val02)) 
                                    + ((-2 * val10) + (0 * val11) + (2 * val12))
                                    + ((-1 * val20) + (0 * val21) + (1 * val22));
                    
                    int gy =  ((-1 * val00) + (-2 * val01) + (-1 * val02))
                                    + ((0 * val10) + (0 * val11) + (0 * val12))
                                    + ((1 * val20) + (2 * val21) + (1 * val22));
                    
                    double gval = Math.sqrt((gx * gx) + (gy * gy));
                    int g = (int) gval;
                    
                    if(maxGradient < g) {
                        maxGradient = g;
                    }
                    
                    edgeColors[i][j] = g;
                }
            }
            
            double scale = 255.0 / maxGradient;
            
            for (int i = 1; i < x - 1; i++) {
                for (int j = 1; j < y - 1; j++) {
                        int edgeColor = edgeColors[i][j];
                        edgeColor = (int)(edgeColor * scale);
                        edgeColor = 0xff000000 | (edgeColor << 16) | (edgeColor << 8) | edgeColor;
                        image.setRGB(i, j, edgeColor);
                    }
                }
            buffer = image;
            file2 = new File("aux.jpg");
            ImageIO.write(image, "jpg", file2);
            rutax = "aux.jpg";
        }
        catch (Exception e) { JOptionPane.showMessageDialog(null,
            "Error en el proceso",
            "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void mostrar(){
            Image img2 = new ImageIcon(rutax).getImage();
            int h=foto.getHeight();
            int w=foto.getWidth();
            mIcon = new ImageIcon(img2.getScaledInstance(w, h, Image.SCALE_SMOOTH));
            foto.setIcon(mIcon);
    }
    
    public static int  getGrayScale(int rgb) {
            int r = (rgb >> 16) & 0xff;
            int g = (rgb >> 8) & 0xff;
            int b = (rgb) & 0xff;

            int gray = (int)(0.2126 * r + 0.7152 * g + 0.0722 * b);

            return gray;
        }
    
    public static void main(String args[]) {
        ProyectoFinal pf = new ProyectoFinal();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoFinal().setVisible(true);
                
            }
        });
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    private javax.swing.JMenuItem negativo;
    private javax.swing.JMenu jmenu1;
    private javax.swing.JMenuItem seleccionar;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenu jmenu2;
    private javax.swing.JMenu jmenu3;
    private javax.swing.JMenu jmenu4;
    private javax.swing.JMenuItem escala;
    private javax.swing.JMenuItem aumentarbrillo;
    private javax.swing.JMenuItem binarizacion;
    private javax.swing.JMenuItem disminuirbrillo;
    private javax.swing.JLabel foto;    
    private javax.swing.JMenuItem laplaceano;
    private javax.swing.JMenuItem prewitt;
    private javax.swing.JMenuItem roberts;
    private javax.swing.JMenuItem sobel;
}