<?php

namespace Database\Seeders;

use App\Models\Role;
use Illuminate\Database\Seeder;

class RoleSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        $roles = array(
            'Administrador',
            'Cajero bancario',
            'Jefe de caja',
            'Autorizador',
            'Ejecutivo de cuenta'
        );

        foreach ($roles as $role)
            (new Role())->create(['role_name' => $role]);
    }
}
