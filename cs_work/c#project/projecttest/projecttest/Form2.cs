using System;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace projecttest
{
    public partial class Form2 : Form
    {
        private string paymentAmount;

        public Form2(string amount)
        {
            InitializeComponent();
            paymentAmount = amount;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            AddPaymentToDatabase("현금");
            MessageBox.Show("결제 완료 되었습니다.");
            this.Close();
        }
        private void button2_Click(object sender, EventArgs e)
        {
            AddPaymentToDatabase("카드");
            MessageBox.Show("결제 완료 되었습니다.");
            this.Close ();
        }
            private void AddPaymentToDatabase(string paymentType)
        {

            string connectionString = "Server=192.168.0.38;Port=3306;Database=sjh;Uid=root;Pwd=1234;";

            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {
                    connection.Open();

                    string query = "INSERT INTO Payment (PaymentType, Amount, Time) VALUES (@PaymentType, @Amount, @Time)";
                    MySqlCommand command = new MySqlCommand(query, connection);

                    command.Parameters.AddWithValue("@PaymentType", paymentType);
                    command.Parameters.AddWithValue("@Amount", paymentAmount);
                    command.Parameters.AddWithValue("@Time", DateTime.Now);

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


