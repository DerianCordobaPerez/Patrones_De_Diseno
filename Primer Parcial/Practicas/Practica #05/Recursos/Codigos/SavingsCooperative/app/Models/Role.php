<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Builder;
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\BelongsToMany;

/**
 * @property Integer|mixed role_code
 * @property string|mixed role_name
 * @mixin Builder
 */
class Role extends Model
{
    use HasFactory;

    /**
     * @var string
     */
    public $primaryKey = 'role_code';

    /**
     * @var string[]
     */
    protected $guarded = ['role_code'];

    /**
     * @var string[]
     */
    protected $fillable = ['role_name'];

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
