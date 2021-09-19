<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateRolePrivilegesTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('role_privileges', function (Blueprint $table) {
            $table->id();
            $table->unsignedInteger('role_code');
            $table->unsignedBigInteger('privilege_id');

            $table->foreign('role_code')
                ->references('role_code')->on('roles')->onUpdate('cascade')->onDelete('cascade');

            $table->foreign('privilege_id')
                ->references('id')->on('privileges')->onUpdate('cascade')->onDelete('cascade');

            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('role_privileges');
    }
}
