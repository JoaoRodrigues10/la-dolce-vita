/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2024-05-17 11:43:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carrinho_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Componentes/cabecalho.jsp", Long.valueOf(1715830252000L));
    _jspx_dependants.put("/Componentes/rodape.jsp", Long.valueOf(1715946165233L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\"href= \"/css/carrinho.css\">\n");
      out.write("    <link rel=\"stylesheet\"href= \"/css/rodape.css\">\n");
      out.write("    <title>Doces</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link  rel=\"stylesheet\"href= \"cabecalho.css\">\n");
      out.write("    <title>Cabeçalho</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"aviso\">\n");
      out.write("        <div class=\"comunicado\">FAÇA AGORA SEU PEDIDO ONLINE</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"cabecalho\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <img src=\"/img/logo.jfif\" alt=\"\" onclick=\"window.location.href='/index.jsp'\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"opcoes\">\n");
      out.write("            <a href=\"/index.jsp\">INÍCIO</a>\n");
      out.write("            <a href=\"/menu.jsp\">MENU</a>\n");
      out.write("            <a href=\"/index.jsp#sobre\">SOBRE</a>\n");
      out.write("            <a href=\"#rodape\">CONTATO</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"acoes\">\n");
      out.write("            <a href=\"/menuADM.jsp\"><img src=\"/img/lupa.png\" alt=\"\"></a>\n");
      out.write("            <a href=\"/login.jsp\"><img src=\"/img/perfil.png\" alt=\"\"></a>\n");
      out.write("            <a href=\"/carrinho.jsp\"><img src=\"/img/sacola.png\" alt=\"\"></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"linha\"></div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"titulo\">CARRINHO</div>\n");
      out.write("\n");
      out.write("    <div class=\"conteudo\">\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"text-align: left;\">PRODUTO</th>\n");
      out.write("                    <th>PREÇO</th>\n");
      out.write("                    <th>QUANTIDADE</th>\n");
      out.write("                    <th>TOTAL</th>\n");
      out.write("                    <th>REMOVER</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div class=\"detalhe\">\n");
      out.write("                            <img src=\"/img/bolo.jfif\" class=\"img\">\n");
      out.write("                            <div class=\"info\">\n");
      out.write("                                <div class=\"info-produto\">Nome do Produto</div>\n");
      out.write("                                <div>Descrição do Produto</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>R$ 50,00</td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <button class=\"qtd-bot\">-</button>\n");
      out.write("                        <span>1</span>\n");
      out.write("                        <button class=\"qtd-bot\">+</button>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>R$ 50,00</td>\n");
      out.write("\n");
      out.write("                    <td><button class=\"remover\">X</button></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <div class=\"titulo\">RESUMO DA COMPRA<br>PRECISO TERMINAR</div>\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"parte1\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <div class=\"desc\">Sub-total</div>\n");
      out.write("                    <div class=\"result\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"par\">\n");
      out.write("                    <div class=\"desc\">Frete</div>\n");
      out.write("                    <div class=\"result\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"par\">Adicionar cupom de desconto</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"parte2\">\n");
      out.write("                <div class=\"desc\">Total</div>\n");
      out.write("                <div class=\"result\">R$ 780,00</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link  rel=\"stylesheet\"href= \"rodape.css\">\n");
      out.write("    <title>Cabeçalho</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"linha\" id=\"rodape\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"rodape\">\n");
      out.write("        <div class=\"r1\">\n");
      out.write("            <img src=\"/img/logo.jfif\" alt=\"\" onclick=\"window.location.href='/index.jsp'\">\n");
      out.write("            <div class=\"icones\">\n");
      out.write("                <div class=\"btn fundo\">\n");
      out.write("                    <i class=\"fa-brands fa-whatsapp\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn fundo\">\n");
      out.write("                    <i class=\"fa-brands fa-linkedin-in\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn fundo\">\n");
      out.write("                    <i class=\"fa-brands fa-instagram\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"btn fundo\">\n");
      out.write("                    <i class=\"fa-brands fa-facebook-f\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"confeitaria\">Desde 2000 - Confeitaria La Dolce Vita</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"r2\">\n");
      out.write("            <div class=\"rtitulo\">HOME PAGE</div>\n");
      out.write("            <a href=\"menu.jsp\"><div class=\"ropcoes\">MENU</div></a>\n");
      out.write("            <a href=\"index.jsp#sobre\"><div class=\"ropcoes\">SOBRE</div></a>\n");
      out.write("            <a href=\"index.jsp#rodape\"><div class=\"ropcoes\">CONTATO</div></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"r3\">\n");
      out.write("            <div class=\"r3titulo\">CONTATO</div>\n");
      out.write("            <div class=\"rcombo\">\n");
      out.write("                <div class=\"subinfo\">Delivery</div>\n");
      out.write("                <div class=\"info\">(11) 9 9429-9161</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rcombo\">\n");
      out.write("                <div class=\"subinfo\">Eventos</div>\n");
      out.write("                <div class=\"info\">(11) 9 9429-9161</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rcombo\">\n");
      out.write("                <div class=\"subinfo\">Trabelhe conosco</div>\n");
      out.write("                <div class=\"info\">recrutamento@ladolcevita.com.br</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"aviso\">\n");
      out.write("        <div class=\"comunicado\" onclick=\"window.location.href='/index.jsp'\">WWW.LADOLCEVITA.COM.BR</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
