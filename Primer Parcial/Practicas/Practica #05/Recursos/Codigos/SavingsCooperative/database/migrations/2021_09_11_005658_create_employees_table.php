<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateEmployeesTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('employees', function (Blueprint $table) {
            $table->string('employee_code')->unique();
            $table->string('name');
            $table->string('identification')->unique();
            $table->enum('sex', ['f', 'm']);
            $table->string('marital_status');
            $table->string('profession');
            $table->string('nationality');
            $table->date('date_of_birth');
            $table->dateTime('date_of_admission');
            $table->dateTime('departure_date');
            $table->string('internal_mail');
            $table->string('personal_mail');
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
        Schema::dropIfExists('employees');
    }
}
