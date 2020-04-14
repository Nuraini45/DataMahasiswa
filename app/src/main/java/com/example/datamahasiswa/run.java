public void run (View view)

        {
            if (nomhs.getText().toString().equals("")||
        nama.getText().toString().equals("") ||
        phone.getText().toString().equals("")) {
                Toast.makeText(getApplicationContext(),
        text: "Data Harus Diisi Semua !",Toast.LENGTH_LONG).show();

        } else {
                mydb.insertContact(nomhs.getText().toString(), nama.getText().toString(),phone.getText().toString());
                Toast.makeText(getApplicationContext(),
        text"Insert data berhasil",Toast.LENGTH_LONG.show();

                insert i = new Intent (getAplicationContext(), MainActivity.class);
                startActivity(i);
        }
        }


        
