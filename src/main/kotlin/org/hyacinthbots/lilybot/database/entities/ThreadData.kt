package org.hyacinthbots.lilybot.database.entities

import dev.kord.common.entity.Snowflake
import kotlinx.serialization.Serializable

/**
 * The data for threads.
 *
 * @property guildId The ID of the guild this thread is in
 * @property threadId The ID of the thread
 * @property ownerId The ID of the thread's owner
 * @property preventArchiving Whether to stop the thread from being archived or not
 * @since 3.2.0
 */
@Suppress("DataClassShouldBeImmutable")
@Serializable
data class ThreadData(
	val guildId: Snowflake?, // TODO make not nullable after migration
	val threadId: Snowflake,
	val ownerId: Snowflake,
	var preventArchiving: Boolean = false
)
