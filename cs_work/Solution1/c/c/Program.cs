using System.Data.SqlClient;
using System;
using MySql.Data.MySqlClient;

namespace c
{
    internal static class Program
    {
        [STAThread]
        static void Main()
        {
            string connectionString = "Server=192.168.0.38;Port=3306;Database=sjh;Uid=root;Pwd=1234;";
            {
                using (MySqlConnection connection = new MySqlConnection(connectionString))
                {
                    try
                    {
                        connection.Open();
                        string query = "SELECT * FROM Payment";
                        MySqlCommand command = new MySqlCommand(query, connection);

                        MySqlDataReader reader = command.ExecuteReader();
                        while (reader.Read())
                        {
                            Console.WriteLine("Amount: " + reader["Amount"] + ", Card: " + reader["Card"] + ", Cash: " + reader["Cash"]);
                        }
                        reader.Close();
                    }
                    catch (Exception ex)
                    {
                        Console.WriteLine("Error: " + ex.Message);
                    }
                }

            }
            ApplicationConfiguration.Initialize();
            Application.Run(new Form1());
        }
    }
}