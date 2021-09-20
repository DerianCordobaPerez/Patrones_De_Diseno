<?php

namespace Database\Seeders;

use App\Models\Employee;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Seeder;

class EmployeeSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        (new Employee())->create([
            'name' => 'Vianec',
            'identification' => '281-pescado-neitor',
            'sex' => 'm',
            'marital_status' => 'casado con su tia',
            'profession' => 'acuatico',
            'nationality' => 'Atlantico',
            'date_of_birth' => '2000-12-12',
            'date_of_admission' => '2018-12-25',
            'departure_date' => '2000-04-25',
            'internal_mail' => 'vianec@empresa.ni',
            'personal_mail' => 'megustaelhentai@anime.com'
        ]);

        (new Employee())->create([
            'name' => 'Chopan',
            'identification' => '281-tienda-chopan',
            'sex' => 'f',
            'marital_status' => 'soltero forever',
            'profession' => 'gym',
            'nationality' => 'arroceño',
            'date_of_birth' => '2000-12-12',
            'date_of_admission' => '2018-12-25',
            'departure_date' => '2000-04-25',
            'internal_mail' => 'chico@empresa.ni',
            'personal_mail' => 'siempresolteronuncainsoltero@gym.com'
        ]);
    }
}
