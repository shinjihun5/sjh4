using System;
using System.Windows.Forms;

namespace projecttest
{
    public partial class Form1 : Form
    {
        private string paymentAmount;
        public Form1()
        {
            InitializeComponent();
        }
        
        private void button1_Click(object sender, EventArgs e)
        {
            string userInput = textBox1.Text;
            if (!string.IsNullOrWhiteSpace(userInput)) 
            {
                paymentAmount = userInput; 
                OpenPaymentForm();
            }
            else
            {  MessageBox.Show("금액을 입력하세요.", "알림", MessageBoxButtons.OK, MessageBoxIcon.Warning);
        }
        }
        private void OpenPaymentForm()
        {
            Form2 form2 = new Form2(paymentAmount, this);
            form2.FormClosed += Form2_FormClosed; 
            form2.Show();
        }

       
        private void Form2_FormClosed(object sender, FormClosedEventArgs e)
        {
            ResetAmount();
        }

       
        public void ResetAmount()
        {
            paymentAmount = ""; 
            textBox1.Text = "";
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
