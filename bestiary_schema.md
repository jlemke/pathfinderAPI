### Bestiary
line  
1 : name, challenge_rating  
2 : experience_points  
3 : race*, class_levels*+  
4 : alignment, size, type, subtypes*+  
5 : initiative, senses*+, perception_bonus  
6*: **aura**


* monster
    * name
    * short_description
    * challenge_rating
    * experience_points
    * race
    * **monster_class_levels** table
    * alignment
    * size
    * type
    * **monster_subtypes** table
    * initiative
    * **monster_senses** table
    * perception_bonus
    * **monster_auras** table
    * armor_class
    * touch
    * flat_footed
    * **monster_ac_modifiers** table _rename to breakdown_
    * hit_points
    * hit_dice
    * fort_save
    * ref_save
    * will_save
    * **monster_dr** table
    * **monster_immunities** table
    * **monster_resistances** table
    * **monster_spell_resistance** table
    * **monster_weaknesses** table
    * **monster_speeds** table
    * **monster_melee_attacks** table
    * **monster_ranged_attacks** table
    * space
    * reach  //note : can be conditional
    * **monster_special_attacks** table
    * **monster_spell-like_abilities** table
    * **monster_spells_known** table
    * **monster_spells_prepared** table
    * **monster_domains** table
    * monster_bloodline
    * monster_arcane_school
    * **monster_opposition_schools** table
    * **monster_ability_scores** table
    * **monster_tactics** table
    * base_statistics
    * base_attack_bonus
    * combat_maneuver_bonus
    * combat_maneuver_defense
    * **monster_feats** table
    * **monster_skills** table
    * **monster_languages** table
    * **monster_special_qualities** table
    * **monster_gear** table
    * boon
    * environment
    * organization
    * treasure
    * full_description
    
 
 
* monster_class_levels
    * monster_name
    * class_name
    * class_level
    
* monster_subtypes
    * monster_name varchar(50) primary_key
    * monster_subtype varchar(50) primary_key

* monster_senses
    * monster_name
    * sense
    
* monster_auras
    * monster_name
    * aura
    * radius
    * difficulty_class
    
* monster_ac_modifiers
    * monster_name
    * modifier
    * type
    
    //deprecated
* monster_save_modifiers
    * monster_name
    * modifier
    * type
    * _source table?_
    
* monster_defensive_abilities
    * monster_name
    * ability
    
* monster_dr
    * monster_name
    * bypass
    
* monster_immunities
    * monster_name
    * immunity

* monster_resistances
    * monster_name
    * resistance
    * amount
   
* monster_spell_resistance
    * monster_name
    * amount
    
* monster_weaknesses
    * monster_name
    * weakness
    
* monster_speeds
    * monster_name
    * speed
    
possibly add way to show 'one or the other' attacks??
    
* monster_melee_attacks
    * monster_name
    * quantity
    * attack_name
    * attack_bonuses
    * damage_roll
    * critical_multiplier
    * critical_range
    * *attack_index*
    * *optional*
  
* monster_ranged_attacks
    * monster_name
    * quantity
    * attack_name
    * attack_bonuses
    * damage_roll
    * critical_multiplier
    * critical_range
    * *attack_index*
    * *optional*
  
* monster_special_attacks
    * monster_name
    * special_attack
  
* monster_spell-like_abilities
    * monster_name
    * ability_name
    * note
    * source
    * prd_link
    * times_per_day
    * caster_level
    * concentration_bonus
    
* monster_spells_known
    * monster_name
    * spell_name
    * spell_level
    * note
    * source
    * prd_link
    * spells_per_day
    * caster_level
    * concentration_bonus
    * spell_failure_chance
    
* monster_spells_prepared
    * monster_name
    * spell_name
    * spell_level
    * note
    * source
    * prd_link
    * number_prepared
    * caster_level
    * concentration_bonus
    * spell_failure_chance

* monster_domains
    * monster_name
    * domain_name

* monster_opposition_schools
    * monster_name
    * school_name
    
* monster_ability_scores
    * monster_name
    * str
    * dex
    * con
    * int
    * wis
    * cha
    * strMod
    * dexMod
    * conMod
    * intMod
    * wisMod
    * chaMod
    
* monster_tactics
    * monster_name
    * before_combat
    * during_combat

* monster_feats
    * monster_name
    * feat_name
    * prd_link
    
* monster_skills
    * monster_name
    * skill_name
    * bonus
    * note
    
* monster_languages
    * monster_name
    * language
    
* monster_special_qualities
    * monster_name
    * quality_name