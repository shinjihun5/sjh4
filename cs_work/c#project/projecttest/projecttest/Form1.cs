using System;
using System.Windows.Forms;

namespace projecttest
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string userInput = textBox1.Text;
            if (!string.IsNullOrWhiteSpace(userInput)) 
            {
                Form2 form2 = new Form2(userInput);
                form2.Show();
            }
            else
            {  MessageBox.Show("금액을 입력하세요.", "알림", MessageBoxButtons.OK, MessageBoxIcon.Warning);

        }
    }
        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
