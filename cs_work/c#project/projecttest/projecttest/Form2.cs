using System;
using System.Collections.Generic;
using System.Windows.Forms;
using MySql.Data.MySqlClient;
using Mysqlx.Crud;

namespace projecttest
{
    public partial class Form2 : Form
    {
        private string paymentAmount;
        public Form2(string amount, Form1 form1)
        {
            InitializeComponent();
            paymentAmount = amount;
        }
        private int CreateOrderAndGetId()
        {
            int orderId = -1;
            
            string connectionString = "Server=192.168.0.38;Port=3306;Database=BurgerKing;Uid=root;Pwd=1234;";

            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {
                    connection.Open();

                    string insertQuery = "INSERT INTO `order` (order_time) VALUES (NOW())"; 
                    MySqlCommand insertCommand = new MySqlCommand(insertQuery, connection);
                    insertCommand.ExecuteNonQuery();

                    string selectQuery = "SELECT LAST_INSERT_ID()"; 
                    MySqlCommand selectCommand = new MySqlCommand(selectQuery, connection);
            //        orderId = Convert.ToInt32(selectCommand.ExecuteScalar()); 
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Error creating order: " + ex.Message);
                }
            }

            return orderId;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            int orderId = CreateOrderAndGetId();
            AddPaymentToDatabase("현금",orderId);
            MessageBox.Show("결제 완료 되었습니다.");
       
            this.Close();
        }
        private void button2_Click(object sender, EventArgs e)
        {
            int orderId = CreateOrderAndGetId();
            AddPaymentToDatabase("카드",orderId);
            MessageBox.Show("결제 완료 되었습니다.");
            this.Close ();
        }
      /*  private int GetRandomExistingOrderId()
        {
            string connectionString = "Server=192.168.0.38;Port=3306;Database=sjh;Uid=root;Pwd=1234;";

            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {
                    connection.Open();

                    string query = "SELECT order_id FROM `order` ORDER BY RAND() LIMIT 1"; // 무작위로 하나의 주문 ID를 선택
                    MySqlCommand command = new MySqlCommand(query, connection);
                    int orderId = (int)command.ExecuteScalar(); // 주문 ID 가져오기

                    return orderId;
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Error: " + ex.Message);
                    return -1; // 오류 발생 시 -1 반환
                }
            }
        }
           private int GetRandomOrderId()
           {
               Random random = new Random();
               return random.Next(1000, 9999); 
           }*/
        private void AddPaymentToDatabase(string paymentType, int orderId)
        {

            string connectionString = "Server=192.168.0.38;Port=3306;Database=sjh;Uid=root;Pwd=1234;";

            using (MySqlConnection connection = new MySqlConnection(connectionString))
            {
                try
                {
                    connection.Open();

                    string query = "INSERT INTO Payment(PaymentType, amount, DateTime, order_id) " +
                           "VALUES (@PaymentType, @amount, @DateTime, @order_id)"; 
                    MySqlCommand command = new MySqlCommand(query, connection);

                    command.Parameters.AddWithValue("@order_id", orderId);
                    command.Parameters.AddWithValue("@PaymentType", paymentType);
                    command.Parameters.AddWithValue("@amount", paymentAmount);
                    command.Parameters.AddWithValue("@DateTime", DateTime.Now);

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


