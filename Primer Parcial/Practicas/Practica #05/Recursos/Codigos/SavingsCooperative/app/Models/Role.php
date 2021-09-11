<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Builder;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\BelongsToMany;

/**
 * @property Integer|mixed RoleCode
 * @property string|mixed RoleName
 * @mixin Builder
 */
class Role extends Model
{
    use HasFactory;

    public $primaryKey = 'RoleCode';
    protected $guarded = ['RoleCode'];
    protected $fillable = ['RoleName'];

    /**
     * Regresa la relacion de usuarios con roles
     *
     * @return BelongsToMany
     */
    public function users(): BelongsToMany
    {
        return $this->belongsToMany(User::class);
    }

}
