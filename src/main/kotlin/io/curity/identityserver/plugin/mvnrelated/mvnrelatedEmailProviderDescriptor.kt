package io.curity.identityserver.plugin.mvnrelated

import se.curity.identityserver.sdk.plugin.descriptor.EmailProviderPluginDescriptor

class mvnrelatedEmailProviderDescriptor: EmailProviderPluginDescriptor<mvnrelatedEmailProviderConfig>
{
    override fun getEmailSenderType() = mvnrelatedEmailSender::class.java

    override fun getPluginImplementationType() = "mvnrelated"

    override fun getConfigurationType() = mvnrelatedEmailProviderConfig::class.java
}
