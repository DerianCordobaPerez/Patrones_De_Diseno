<?php

namespace App\Models;

use DateTime;
use Illuminate\Database\Eloquent\Builder;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\HasOne;

/**
 * @property mixed user_code
 * @property string employee_code
 * @property mixed role_code
 * @property string password
 * @property DateTime start_date
 * @property DateTime final_date
 * @mixin Builder
 */
class UserRole extends Model
{
    use HasFactory;

    protected $primaryKey = 'user_code';

    protected $guarded = ['user_code'];

    protected $fillable = ['employee_code', 'role_code', 'password', 'start_date', 'final_date'];

    public function employee(): HasOne {
        return $this->hasOne(Employee::class, 'employee_code', 'employee_code');
    }

    public function role(): HasOne
    {
        return $this->hasOne(Role::class, 'role_code', 'role_code');
    }

    protected $hidden =['password'];
}
