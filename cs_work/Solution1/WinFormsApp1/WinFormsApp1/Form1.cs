namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show(((Button)sender).ToString());
            MessageBox.Show(tb.Text);
        }

        private void button5_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click_1(object sender, EventArgs e)
        {
            int num1;
            int num2;
            int.TryParse(tb_num1.Text.ToString(), out num1);
            int.TryParse(tb_num2.Text.ToString(), out num2);

            MessageBox.Show("���ϱ�" + (num1 + num2));
            lb_result.Text = (num1 + num2) + "";
        }

        private void button3_Click_1(object sender, EventArgs e)
        {
            int num1 = int.Parse(tb_num1.Text);
            int num2 = int.Parse(tb_num2.Text);

            MessageBox.Show("����" + (num1 - num2));
            lb_result.Text = (num1 - num2) + "";
        }

        private void button4_Click_1(object sender, EventArgs e)
        {
            int num1 = int.Parse(tb_num1.Text);
            int num2 = int.Parse(tb_num2.Text);

            MessageBox.Show("������" + (num1 / num2));
            lb_result.Text = (num1 / num2) + "";
        }

        private void button5_Click_1(object sender, EventArgs e)
        {
            int num1 = int.Parse(tb_num1.Text);
            int num2 = int.Parse(tb_num2.Text);

            MessageBox.Show("���ϱ�" + (num1 * num2));
            lb_result.Text = (num1 * num2) + "";
        }
    }
}
