<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateUserRolesTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('user_roles', function (Blueprint $table) {
            $table->unsignedInteger('user_code')->unique();
            $table->string('employee_code');
            $table->unsignedInteger('role_code');
            $table->string('password');
            $table->dateTime('start_date');
            $table->dateTime('final_date');

            $table->foreign('employee_code')
                ->references('employee_code')->on('employees')->onUpdate('cascade')->onDelete('cascade');

            $table->foreign('role_code')
                ->references('role_code')->on('roles')->onUpdate('cascade')->onDelete('cascade');

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
        Schema::dropIfExists('user_roles');
    }
}
