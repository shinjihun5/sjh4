using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace c
{
    public partial class Form2 : Form
    {
        private decimal paymentAmount;
        public Form2(decimal amount)
        {
            InitializeComponent();
            paymentAmount = amount;
        }
        private void Form1_Resize(object sender, EventArgs e)
        {
            button1.Location = new Point((this.ClientSize.Width - button1.Width) / 2, (this.ClientSize.Height - button1.Height) / 2);

            button2.Location = new Point((this.ClientSize.Width - button2.Width) / 2, (this.ClientSize.Height - button2.Height) / 2);
        }

        public enum PaymentType
        {
            Card,
            Cash
        }
        private void button2_Click(object sender, EventArgs e)
        {
            PaymentType paymentType = PaymentType.Card;
            decimal paymentAmount = decimal.Parse(txtAmount.Text);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string paymentType = "현금";

            AddPaymentToDatabase(paymentType, paymentAmount);
        }
        private void AddPaymentToDatabase(string paymentType,decimal amount)
        {

            string connectionString = "Server=192.168.0.38;Port=3306;Database=sjh;Uid=root;Pwd=1234;";


            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {

                    connection.Open();

                    string query = "INSERT INTO Payment (PaymentType, Amount) VALUES (@PaymentType, @Amount)";
                    MySqlCommand command = new MySqlCommand(query, connection);

                    command.Parameters.AddWithValue("@PaymentType", paymentType);
                    command.Parameters.AddWithValue("@Amount", amount);


                    command.ExecuteNonQuery();
                }
                catch (Exception ex)
                {

                    MessageBox.Show("Error: " + ex.Message);
                }
            }
        }
    }
}

