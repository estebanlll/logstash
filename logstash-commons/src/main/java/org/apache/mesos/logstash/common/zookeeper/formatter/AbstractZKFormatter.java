package org.apache.mesos.logstash.common.zookeeper.formatter;

import org.apache.mesos.logstash.common.zookeeper.parser.ZKAddressParser;

/**
 * Abstract class representing a ZK formatter
 */
public abstract class AbstractZKFormatter implements ZKFormatter {
    protected final ZKAddressParser parser;

    public AbstractZKFormatter(ZKAddressParser parser) {
        this.parser = parser;
    }

    public abstract String format(String zkURL);
}
