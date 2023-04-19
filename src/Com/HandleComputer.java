package Com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="HandleComputer", urlPatterns={"/HandleComputer"})
public class HandleComputer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取用户输入的操作数和运算符
        int operand1 = Integer.parseInt(request.getParameter("operand1"));
        int operand2 = Integer.parseInt(request.getParameter("operand2"));
        String operator = request.getParameter("operator");

        // 将用户输入的数据存入实体模型中
        Com.Computer computer = new Com.Computer();
        computer.setOperand1(operand1);
        computer.setOperand2(operand2);
        computer.setOperator(operator);

        // 调用业务模型进行计算
        Com.CalculateBean calculateBean = new Com.CalculateBean();
        double result = calculateBean.calculate(operand1, operand2, operator);
        System.out.println("计算结果为"+result);

        // 将计算结果存入实体模型
        computer.setResult(result);

        // 将实体模型存入请求属性中，以便在 showResult.jsp 中显示计算结果
        request.setAttribute("computer", computer);

        // 转发到 showResult.jsp 页面显示计算结果
        request.getRequestDispatcher("showResult.jsp").forward(request, response);
    }
}
