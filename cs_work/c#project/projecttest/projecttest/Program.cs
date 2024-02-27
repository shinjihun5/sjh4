using MySql.Data.MySqlClient;
using System.Runtime.InteropServices;

namespace projecttest
{
    internal static class Program
    {
        [DllImport("kernel32.dll", SetLastError = true)]
        static extern bool AllocConsole();

        [DllImport("kernel32.dll", SetLastError = true)]
        static extern bool FreeConsole();

        [DllImport("kernel32.dll", SetLastError = true)]
        static extern IntPtr GetConsoleWindow();

        [DllImport("user32.dll", SetLastError = true)]
        static extern bool UpdateWindow(IntPtr hWnd);
        [STAThread]
        static void Main()
        {
            IntPtr consoleWindow = GetConsoleWindow();
            UpdateWindow(consoleWindow);
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
                            Console.WriteLine("Amount: " + reader["amount"] + " DateTime: " + reader["DateTime"]); 
                                // + ", Card: " + reader["Card"] + ", Cash: " + reader["Cash"]);
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