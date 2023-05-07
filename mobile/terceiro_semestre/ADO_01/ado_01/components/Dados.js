import { View, StyleSheet, Text } from "react-native"

export default function Dados(props) {
    const form = props.route.params.paramKey
    return (
        <View style={styles.container}>
            <Text>Seu nome: {form?.nome}</Text>
            <Text>Seu sobrenome: {form?.sobrenome}</Text>
            <Text>Seu telefone: {form?.telefone}</Text>
            <Text>Seu endereço: {form?.endereco}</Text>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center',
        margin: 10,
        borderColor: "red",
        borderWidth: 1,
    },
})