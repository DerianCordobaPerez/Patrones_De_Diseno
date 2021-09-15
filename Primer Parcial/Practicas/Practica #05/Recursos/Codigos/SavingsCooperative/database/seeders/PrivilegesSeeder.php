<?php

namespace Database\Seeders;

use App\Models\Privileges;
use Illuminate\Database\Seeder;
use function React\Promise\map;

class PrivilegesSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        $names = array(
            'Creacion y Mantenimiento de Usuarios',
            'Creacion y Mantenimiento de Roles',
            'Control de caja',
            'Control de boveda',
            'Autorizar/Negar transacciones',
            'Control de cierre de cajas',
            'Movimientos de Boveda',
            'Apertura de cuentas',
            'Creacion y mantenimiento de socios',
            'Creacion de cuentas bancarias',
            'Realizacion de transferencias',
            'Manejo de cheques y otros documentos'
        );

        foreach ($names as $name)
            (new Privileges())->create(['name' => $name]);
    }
}
