# CHWorldBorder

An extension to [CommandHelper](https://github.com/sk89q/CommandHelper) providing access to world border functions.
Downloads available in releases tab.

### Functions
##### Returns | FunctionName(Arguments)
Location | border_get_center()
Gets the current border center.

double | border_get_damage_amount()
Gets the current border damage amount.

double | border_get_damage_buffer()
Gets the current border damage buffer.

double | border_get_size()
Gets the current border size.

int | border_get_warning_distance()
Gets the current border warning distance.

int | border_get_warning_time()
Gets the current border warning time in seconds.

void | border_reset()
Resets the border to default values.

void | border_set_center(double x, double z)
Sets the new border center.

void | border_set_damage_amount(double damage)
Sets the amount of damage a player takes when outside the border plus the border buffer.

void | border_set_damage_buffer(double blocks)
Sets the amount of blocks a player may safely be outside the border before taking damage.

void | border_set_size(double newSize, int seconds)
Sets the border to a square region with the specified size in blocks.

void | border_set_warning_distance(int distance)
Sets the warning distance that causes the screen to be tinted red when the player is within the specified number of blocks from the border.

void | border_set_warning_time(int seconds)
Sets the warning time that causes the screen to be tinted red when a contracting border will reach the player within the specified time.

