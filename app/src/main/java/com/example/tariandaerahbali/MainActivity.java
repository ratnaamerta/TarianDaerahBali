package com.example.tariandaerahbali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> NamaTarian = new ArrayList<>();
    private ArrayList<String> JenisTarian = new ArrayList<>();
    private ArrayList<String> LinkGambar = new ArrayList<>();
    private ArrayList<String> DetailPemain = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        LinkGambar.add("https://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Bali-Danse_0704a.jpg/250px-Bali-Danse_0704a.jpg");
        NamaTarian.add("Tari Legong");
        JenisTarian.add("Jenis Tari Kelompok");
        DetailPemain.add("Kata Legong sendiri berasal dari asal kata “Leg” yang memiliki arti luwes serta “gong” yang dapat diartikan sebagai gamelan. Oleh sebab itulah, tarian ini memiliki gerakan yang lemah gemulai yang diiringi dengan gamelan tradisional khas Bali bernama Semar Pegulingan. Selain itu, para penari yang memainkan Legong menggunakan kipas, kecuali tokoh Condong. Tari Legong ditarikan oleh 2-3 orang penari yang menghadirkan tokoh “Condong” sebagai pembuka tarian ini, namun ada kalanya tari Legong ini tidak menghadirkan tokoh tersebut, tergantung jumlah penarinya");

        LinkGambar.add("https://upload.wikimedia.org/wikipedia/commons/3/36/Tari_Pendet.jpg");
        NamaTarian.add("Tari Pendet");
        JenisTarian.add("Jenis Tari Kelompok");
        DetailPemain.add("Tari Pendet bisa disebut sebagai bentuk penyambutan atas turunnya para dewa ke dunia. Seiring dengan berjalannya waktu, para seniman tari di pulau Bali mengubah tarian tersebut menjadi sebuah tarian selamat datang. Tari putri ini memiliki pola gerak yang lebih dinamis daripada Tari Rejang yang dibawakan secara berkelompok atau berpasangan");

        LinkGambar.add("https://services.lampungpro.id//fileload/tari-kecak-2jpg_Jpc0f.jpg");
        NamaTarian.add("Tari Kecak");
        JenisTarian.add("Jenis Tari Kelompok");
        DetailPemain.add("Tari Kecak adalah tarian adat Bali yang sudah sangat terkenal dan telah menjadi salah satu pertunjukan khas yang diburu para wisatawan. Tarian ini menceritakan epic Ramayana dan rata-rata semua penarinya adalah laki – laki. Jumlah penari yang membawakan Tari Kecak bisa berjumlah puluhan bahkan lebih. Para penari yang duduk melingkar dan menyerukan “cak” sembari mengangkat kedua lengan. Hal tersebut menggambarkan tentara kera saat membantu Rama melawan Rahwana");

        LinkGambar.add("http://www.balitoursclub.net/wp-content/uploads/2016/09/Sinopsis-tari-Barong-di-Batubulan.jpg");
        NamaTarian.add("Tari Barong");
        JenisTarian.add("Jenis Tari Berpasangan");
        DetailPemain.add("Kata Barong berasal dari asal kata “Bahruang” yang memiliki arti beruang. Walaupung begitu, wujud dari binatang yang digambarkan bisa beragam tergantung dari jenis tari Barong yang dibawa, ada Barong Bangkal, Barong Macan, Barong Asu, Barong Gajah, Barong Blasblasan, Barong Landung dan yang paling terkenal, yaitu Barong Keket atau Barong Ket yang menggambarkan perpaduan antara macan, singa dan sapi. Tarian ini menceritakan tentang perseteruan antara kebajikan yang disimbolkan dengan barong, dan kejahatan yang digambarkan dengan sosok rangda. Tarian ini biasa ditarikan oleh 2 orang laki – laki, yang satu memainkan bagian kepala dan yang lain berada di bagian ekor");

        LinkGambar.add("https://farm8.staticflickr.com/7260/7771090234_52b4bdfb9d.jpg");
        NamaTarian.add("Tari Cendrawasih");
        JenisTarian.add("Jenis Tari Berpasangan");
        DetailPemain.add("Tari Cendrawasih terinspirasi oleh burung cendrawasih, yang dikenal dalam bahasa Bali sebagai manuk dewata. Jenis burung tersebut dikenal suka menari dan menyanyi ketika berupaya untuk melakukan perkawinan. Tari Cendrawasih adalah salah satu dari beberapa tari Bali yang terinspirasi oleh burung; tarian lainnya meliputi tari Manuk Rawa dan tari Belibis. Tarian ini ditampilkan oleh dua wanita, satu memerankan burung cendrawasih jantan dan satu memerankan betina");

        LinkGambar.add("http://www.wacana.co/wp-content/uploads/2016/10/wacana.co_Tari-Kupu-Kupu-Tarum-1170x780.jpg");
        NamaTarian.add("Tari Kupu-Kupu Tarum");
        JenisTarian.add("Jenis Tari Kelompok");
        DetailPemain.add("Tarian kupu-kupu ini menggambarkan kedamaian, eksotisme, dan keindahan pulau dewata, Bali. Gerakan gemulai para penarinya yang tampak seperti kupu-kupu yang sedang terbang ditambah dengan padanan warna-warni kostum yang dikenakan penarinya membuat tarian ini tampak harmonis");

        LinkGambar.add("https://1.bp.blogspot.com/-xP8KZp2vIG4/WBMMW-DIo9I/AAAAAAAAAXo/bkQK9_gHrpgB1BgA9auHesMwxuJDp7f9gCLcB/s1600/l-margapati.jpg");
        NamaTarian.add("Tari Margapati");
        JenisTarian.add("Jenis Tari Tunggal atau Kelompok");
        DetailPemain.add("Kata Margapati diambil dari kata Marga yang berarti jalan, dan pati berarti kematian. Bila disatukan berarti jalan menuju kematian. Diciptakan oleh Nyoman Kaler pada tahun 1942, tarian ini melukiskan kekeliruan perjalanan hidup seorang wanita. Oleh gara-gara itu, tarian ini banyak menghadirkan gerakan tari laki – laki walau penarinya kebanyakan wanita. Jika dilihat, gerak gerik tarian ini seperti mengintai dan siap-siap menerkam mangsanya");

        LinkGambar.add("http://www.balipost.com/wp-content/uploads/2018/07/balipostcom_menabuh-dalam-kegelapan-menari-dalam-kebisuan_01-696x464.jpg");
        NamaTarian.add("Tari Puspanjali");
        JenisTarian.add("Jenis Tari Kelompok");
        DetailPemain.add("Puspanjali adalah sebuah tarian adat Bali yang merupakan satu wujud penyambutan. Puspanjali merupakan gabungan dari makna kata “puspa” dan “anjali” dimana jika disatukan “menghormati bagai bunga”. Maknanya menghormati para tamu bagai sekuntum bunga. Tarian ini ditampilkan oleh sekelompok penari wanita berjumlah 5 sampai 7 orang");

        LinkGambar.add("http://wisata.balitoursclub.com/wp-content/uploads/2013/10/Tari-Nelayan.jpg");
        NamaTarian.add("Tari Tenun");
        JenisTarian.add("Jenis Tari Kelompok");
        DetailPemain.add("Tari Tenun sangat identik dengan gerakan yang khas dari seorang penenun. Dalam penyajiannya, gerakan dalam tarian ini dimulai dari para penenun yang memintal benang, mengatur benang di alat tenun, dan kemudian di akhiri dengan menenun. Sebagian besar gerakan dalam tari masih mengacu pada unsur-unsur tari klasik, tetapi sebagiannya lagi sudah ditambahkan dengan gerak-gerak imitatif yaitu saat penenun mengerjakan pekerjaannya, seperti sedang memintal benang sampai menenun");

        LinkGambar.add("https://services.sportourism.id/fileload/tari-barisjpg-dblr.jpg?q=75");
        NamaTarian.add("Tari Baris");
        JenisTarian.add("Jenis Tari Tunggal");
        DetailPemain.add("Tari Baris adalah keliru satu tarian adat Bali yang mulanya merupakan satu wujud ritual, tetapi seiring dengan zaman tari ini menjadi tari hiburan. Tari Baris diciptakan pada pertengahan abad ke-16. Di dalam tarian ini, penari menggerakan badannya seperti seorang pahlawan yang tengah berperang, tari ini dipertontonkan perihal keberanian para ksatria Bali yang tengah bertempur demi membela Raja");

        LinkGambar.add("http://ujiansma.com/wp-content/uploads/2014/04/IMG_5740-copy-2.jpg");
        NamaTarian.add("Tari Trunajaya");
        JenisTarian.add("Jenis Tari Tunggal");
        DetailPemain.add("Tari Trunajaya berasal dari kata Teruna. Kata itu diambil dari kata pemuda yang ditemukan dari hasil kreasi Pan Wandres di dalam perjalanannya dan ditambah oleh I Gde Manik. Tarian ini menceritakan perihal seorang laki-laki yang idamkan memikat wanita, nampak dari tiap tiap gerakan tarinya yang tegas dimana antar kaki diberi jarak seperti kuda-kuda. Walau begitu, seiring dengan pertumbuhan zaman tarian ini tidak cuma dibawa oleh laki-laki. Perempuan pun mampu ikut serta, lebih-lebih oleh 2 orang sekaligus");

        showRecyleList();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, NamaTarian, LinkGambar, JenisTarian, DetailPemain);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, NamaTarian, LinkGambar, JenisTarian, DetailPemain);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, NamaTarian, LinkGambar, JenisTarian, DetailPemain);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}
